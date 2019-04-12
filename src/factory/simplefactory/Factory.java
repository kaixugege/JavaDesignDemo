package factory.simplefactory;

/**
 * 简单的工厂模式
 * 缺点：  违背开放-关闭原则，
 * 1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）
 * 2 不同的产品需要不同额外参数的时候 不支持。
 * 简单工厂模式（又称静态工厂模式）由于使用了静态工厂方法，静态方法不能被继承和重写，会造成工厂角色无法形成基于继承的等级结构。
 * 应用场景
 * 在了解了优缺点后，我们知道了简单工厂模式的应用场景：
 * 客户如果只知道传入工厂类的参数，对于如何创建对象的逻辑不关心时；
 * 当工厂类负责创建的对象（具体产品）比较少时。
 */
public class Factory {

    public static Product Manufacture(String productType) {

        switch (productType) {

            case "one":
                return new OneProduct();

            case "two":
                return new TwoProduct();

            default:
                return null;

        }

    }

}
