package single;


/**
 * 静态代码块中单例模式是属于恶汉模式变种，在还不想初始化的时候就已经初始化了
 *
 *
 */
public class SingletonStatic {
    public static SingletonStatic instance;
    /**
     * 静态代码块
     */
    static {
        System.out.println("静态代码块");
        instance =  new SingletonStatic();
    }

    private SingletonStatic(){
        System.out.println("构造函数");
    }

    public SingletonStatic show(){
        System.out.println("show");
        return this;
    }


}
