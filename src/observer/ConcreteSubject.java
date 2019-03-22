package observer;

/**
 * 具体的目标对象，负责把有关状态存入到行营的观察者对象中
 * @author KaixuGege
 */
public class ConcreteSubject extends Sub {

    /**
     * 目标对象的状态
     */
    private String subState;
    public String getSubState() {
        return subState;
    }

    public void setSubState(String subState) {
        this.subState = subState;
        this.notifyObservers();
    }

}
