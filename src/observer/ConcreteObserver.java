package observer;

/**
 * 具体得一个观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    //观察者的状态
    private String observerState;

    /**
     * 拉模型
     *
     * 获取目标类的状态同步到观察者的状态中
     *
     * @param sub 传入目标对象，方便回去相应的目标对象的状态
     */
    @Override
    public void update(Sub sub) {
//        System.out.println("更新了");
        if (sub != null) {
            observerState = ((ConcreteSubject) sub).getSubState();
            System.out.println(name+" " + observerState);
        }
    }

    public void init() {

    }

}
