package observer.WeatherObserverPattem;

public class Example {
    public static void main(String[] args){

        //1、创建一个目标
        ConcreteWeatherSubject weatherSubject = new ConcreteWeatherSubject();

        //2、创建观察者
        ConcreteWeatherObserver observerGf = new ConcreteWeatherObserver();
        observerGf.setObserverName("女朋友");
        observerGf.setRemindThing("去逛街拉");

        ConcreteWeatherObserver observerMother = new ConcreteWeatherObserver();
        observerMother.setObserverName("妈妈");
        observerMother.setRemindThing("回家吃饭");

        //3、注册观察者
        weatherSubject.attach(observerGf);
        weatherSubject.attach(observerMother);

        //4、在目标处发布天气
        weatherSubject.setWeatherContent("下雨了");

    }
}
