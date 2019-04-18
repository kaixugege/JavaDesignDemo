package factory.factorymethod;


import factory.simplefactory.Factory;

/**
 * 工厂方法模式
 * <p>
 * 3.适用场景
 * 消费者不关心它所要创建对象的类(产品类)的时候。
 * 消费者知道它所要创建对象的类(产品类)，但不关心如何创建的时候。
 * 例如：hibernate里通过sessionFactory创建session、通过代理方式生成ws客户端时，通过工厂构建报文中格式化数据的对象。
 */
public class Exampile {
    public static void main(String[] args) {

        //产品 One
        FactoryMethodAbstract factoryOne = new FactoryOne();
        show(factoryOne,"我是产品 one");


        //产品 Two
        FactoryMethodAbstract factoryTwo = new FactoryTwo();
        show(factoryTwo,"我是产品 two");


    }

    private static void show(FactoryMethodAbstract factory,String attr) {
        factory.Manufacture().setAttr(attr).show();
    }

}
