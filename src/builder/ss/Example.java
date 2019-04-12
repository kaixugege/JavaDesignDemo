package builder.ss;


public class Example {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());

        Bike bike = director.build();
        bike.show();
    }
}
