package annotations.a2;


import java.lang.reflect.Field;

public class Example {

    public static void main(String[] args) {
        BIndModel bb = new BIndModel();
        //
        Class<BIndModel> bIndModelClass = (Class<BIndModel>) bb.getClass();
        Field[] fields = bIndModelClass.getDeclaredFields();

        for (Field f : fields) {
            if (f.isAnnotationPresent(BIndView.class)) {
                BIndView bIndView = f.getAnnotation(BIndView.class);
                int values = bIndView.value();

                if (0 != values) {
                    f.setAccessible(true);
                    try {
//                        f.set(bb,bb);
                        f.set(bb, bb.setBt(values+1));
                    } catch (IllegalAccessError e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println(bb.getBt1().show());
        System.out.println(bb.getBt2().show());
    }

}
