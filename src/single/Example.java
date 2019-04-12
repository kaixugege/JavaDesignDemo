package single;

import java.security.PublicKey;

/**
 *
 * 懒汉模式，线程不安全，需要双重加锁，防止反射攻击还需要
 * 就需要按照Joshua Bloch做说的，加个异常处理
 *
 */
public class Example {
    public static void main(String[] args){
        Singleton.newInstance().show();//静态内部类单例
        SingletonStatic.instance.show();//静态代码块单例
        SingletonEnum.INSTANCE.show();//枚举类单例
    }
}
