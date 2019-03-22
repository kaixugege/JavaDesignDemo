package observer;

/**
 * observer.md    发布/订阅模式
 */
public class Example {

    public static void main(String args[]) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        System.out.println("开始更新");
        concreteSubject.attach(new ConcreteObserver("一号"));
        concreteSubject.setSubState("1");
        System.out.println("");
        concreteSubject.attach(new ConcreteObserver("二号"));
        concreteSubject.setSubState("3");
        System.out.println("");
        concreteSubject.attach(new ConcreteObserver("三号"));
        concreteSubject.setSubState("6");
    }

}
