package builder;

/*
 * 建造者模式
 * */
public class Example {
    public static void main(String[] args) {
        System.out.print("sdfsdfsdf");

        BikeCreator.builder()
                .chain("14mm 车链")
                .frame("16寸 车架")
                .wheel("15寸 车轮")
                .build();


        String a = "hello2";
        final String b = "hello";
        String c = b + 2;
        String d = "hello2";
        System.out.println(c == a);
        System.out.println(a == d);

    }
}
