package builder.s;

public class ConcreteBuilder extends Builder {
    private Product product;

    public ConcreteBuilder() {
        product = new Product();
    }

    @Override
    public void buildPartA(String a) {
        product.setPartA("我是"+a);
    }

    @Override
    public void buildPartB(String b) {
        product.setPartB("我是"+b);
    }

    @Override
    public void buildPartC(String c) {
        product.setPartC("我是"+c);
    }

    @Override
    public Product build() {
        return product;
    }

}
