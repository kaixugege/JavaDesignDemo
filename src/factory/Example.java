package factory;

import factory.simplefactory.Factory;

/**
 * 工厂模式：将类的实例化与使用对象的操作分开
 */
public class Example {
    public static void main(String[] args) {

        //简单工厂模式
        Factory.Manufacture("one").show();
        Factory.Manufacture("two").show();



    }
}
