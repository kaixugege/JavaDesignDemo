package factory.factoryabstract;

public class FactoryB implements IFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public Gift createGift() {
        return new GiftA();
    }
}
