package factory.simple;

/**
 * 简单的工厂模式
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
