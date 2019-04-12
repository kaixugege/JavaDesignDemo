package annotations;

import sun.security.krb5.internal.crypto.Des;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Example {

//    @SuppressWarnings("depercation")

    public static void main(String[] args) throws ClassNotFoundException {
        People p = new Child();
        p.age();
        p.work();
        //使用类加载器
        Class c = Class.forName("annotations.Child");
        //找到类上的注解
        boolean isExist = c.isAnnotationPresent(Description.class);//判断是否存在 Description 这个注解

        if (isExist) {
            //拿到注解实例，解析上面的注解
            Description d = (Description) c.getAnnotation(Description.class);
            System.out.println(d.value());
        }

        //获取所有的方法
        Method[] ms = c.getMethods();
        //遍历所有的方法
        for (Method m : ms) {
            boolean isExist1 = m.isAnnotationPresent(Description.class);

            if (isExist1) {
                Description d1 = m.getAnnotation(Description.class);
                System.out.println(d1.value());
            }
        }

        //另一种解析方法
        for (Method m : ms) {
            //拿到方法上的所有的注解
            Annotation[] as = m.getAnnotations();
            for (Annotation a : as) {
                //用二元操作符判断a是否是Description的实例
                if (a instanceof Description) {
                    Description d = (Description) a;
                    System.out.println(d.value());
                }
            }
        }

    }

}
