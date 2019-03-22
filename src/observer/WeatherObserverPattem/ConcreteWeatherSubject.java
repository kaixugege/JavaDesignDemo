package observer.WeatherObserverPattem;

/**
 * 具体的目标对象，负责把有关状态存入到行营的观察者对象中
 * @author KaixuGege
 */
public class ConcreteWeatherSubject extends WeatherSub {

    /**
     * 获取天气的内容
     */
    private String weatherContent;


    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;

        //内容有了，说明天气更新了，通知所有的订阅的人
        notifyObservers();
    }
}
