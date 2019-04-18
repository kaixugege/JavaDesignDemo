package factory.factoryabstract;




/**
 * 抽象工厂模式
 * 3.适用场景

 */
public class Exampile {
    public static void main(String[] args) {
        IFactory factory;
        factory = new FactoryA();
        factory.createGift();
        factory.createProduct();



        factory = new FactoryB();
        factory.createProduct();
        factory.createGift();



    }


}
