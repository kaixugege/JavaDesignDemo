package single;

/**
 * 静态内部类方式的单例模式
 *
 * 这种模式只有在调用的时候才会进行初始化
 *
 * 第一次加载Singleton时不会初始化，
 * 调用 newinstance 的时候会初始化，仅且一次，能够延迟加载
 * 这种能够保证线程安全，也能保证单例对象的唯一性
 */
public class Singleton {

    //创建静态内部类
    private static class Holder {
        private static Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public Singleton show(){
        System.out.println(" 这是静态内部类单例模式 ");
        return this;
    }

    public static Singleton newInstance() {
        return Holder.instance;
    }

}
