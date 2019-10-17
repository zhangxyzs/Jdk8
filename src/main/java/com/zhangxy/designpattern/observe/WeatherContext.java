package com.zhangxy.designpattern.observe;

/**
 * 天气观察站
 *
 * @author zhangxy
 * @date 2019/10/17
 **/
public class WeatherContext {
    private static Observed observed;
    static {
        observed=new WeatherObserved();
    }
    public void addObserver(Observer observer){
        observed.addObserver(observer);
    }
    public void sendMsg(String msg){
        observed.sendWeatherMessage(msg);
    }

    public static void main(String[] args) {
        WeatherContext context=new WeatherContext();
        context.addObserver(new TianjinWeather("天津","天津市"));
        context.addObserver(new TianjinWeather("北京","北京市"));
        context.sendMsg("今天是20191017，天气：小雨");
    }
}
