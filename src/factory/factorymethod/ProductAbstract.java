package factory.factorymethod;

abstract public class ProductAbstract {

    public abstract void show();

    public String getAttr() {
        return attr;
    }

    public ProductAbstract setAttr(String attr) {
        this.attr = attr;
        return this;
    }

    public String attr;

}
