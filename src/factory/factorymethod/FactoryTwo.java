package factory.factorymethod;

public class FactoryTwo extends FactoryMethodAbstract  {
    @Override
    public ProductAbstract Manufacture() {
        return new ProductTwo();
    }
}
