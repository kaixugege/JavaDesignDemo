package factory.factorymethod;

public class FactoryOne extends FactoryMethodAbstract {
    @Override
    public ProductAbstract Manufacture() {
        return new ProductOne();
    }
}
