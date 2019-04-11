package single;


/**
 * 枚举类单例模式
 * 线程安全，防 反射攻击（反射出来的对象和本来的单例对象内存地址不一样）
 * 序列化安全
 *
 * 参考：https://www.cnblogs.com/chiclee/p/9097772.html
 */
public enum SingletonEnum {

    INSTANCE;

    public SingletonEnum show() {
        System.out.println(" enum 下的单例模式");
        return this;
    }

    ;

}
