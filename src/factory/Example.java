package factory;

import factory.simple.Factory;

/**
 * 工厂模式：将类的实例化与使用对象的操作分开
 */
public class Example {
    public static void main(String[] args) {

        Factory.Manufacture("one").show();
        Factory.Manufacture("two").show();



    }
}
