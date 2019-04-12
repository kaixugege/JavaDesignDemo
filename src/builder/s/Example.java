package builder.s;

public class Example {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.setBuilder(new ConcreteBuilder())
                .setPartA("我是a")
                .setPartB("我是b")
                .setPartC("我是c")
                .create();
        product.show();
    }
}
