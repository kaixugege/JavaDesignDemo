package annotations.a1;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//注解会在class文件中存在，在运行时可以通过反编译获取
@Target({ElementType.METHOD, ElementType.FIELD})//定义注解的作用目标的范围字段、枚举的常量、方法
@Documented//说明该注解将包含在Javadoc中
public @interface FieldMeta {

    boolean id() default false;

    String name() default "";

    boolean editable() default true;

    boolean summary() default true;

    String description() default "";

    int order() default 0;

}
