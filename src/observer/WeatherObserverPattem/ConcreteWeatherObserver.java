package observer.WeatherObserverPattem;


/**
 * 具体得一个观察者对象，实现更新的方法，使自身的状态和目标状态保持一致
 */
public class ConcreteWeatherObserver implements Observer {

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    //观察者的名字，是谁收到了这个讯息
    private String observerName;

    //天气内容的情况，这个消息从目标处获取
    private String weatherContent;

    //提醒的内容：是约会还是购物
    private String remindThing;


    @Override
    public void updates(WeatherSub sub) {

        weatherContent = ((ConcreteWeatherSubject) sub).getWeatherContent();
        System.out.println(observerName + " 收到了 " + weatherContent + ", " + remindThing);

    }
}
