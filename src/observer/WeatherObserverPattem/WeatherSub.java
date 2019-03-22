package observer.WeatherObserverPattem;


import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道观察他的观察者，并提供注册（添加）和删除观察者的接口
 *
 * @author KaixuGege
 */
public class WeatherSub {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    //attach     detach motifyObservers
    //把订阅天气的人添加到订阅者列表种
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除结合种的指定订阅天气的人
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    //只有子类才能调用

    /**
     * 通知所有已经订阅了天气的人
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
