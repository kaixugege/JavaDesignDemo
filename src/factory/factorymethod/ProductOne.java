package factory.factorymethod;

public class ProductOne extends ProductAbstract {
    @Override
    public void show() {
            System.out.println(""+getAttr());
    }
}
