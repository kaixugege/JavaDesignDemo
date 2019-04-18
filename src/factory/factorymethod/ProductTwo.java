package factory.factorymethod;

public class ProductTwo extends ProductAbstract {
    @Override
    public void show() {
        System.out.println(""+getAttr());
    }
}
