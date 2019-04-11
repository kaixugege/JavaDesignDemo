package single;

/**
 * 恶汉模式，线程安全
 */
public class SingletonA {

    private volatile static SingletonA uniqueInstance;

    private SingletonA() {
    }

    public static SingletonA getInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonA.class) {
                if (uniqueInstance == null) {//进入区域后，再检查一次，如果仍是null,才创建实例
                    uniqueInstance = new SingletonA();
                }
            }
        }
        return uniqueInstance;
    }
}
