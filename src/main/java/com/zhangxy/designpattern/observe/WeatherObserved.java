package com.zhangxy.designpattern.observe;

import java.util.ArrayList;

/**
 * 被观察者
 *
 * @author zhangxy
 * @date 2019/10/17
 **/
public class WeatherObserved implements Observed{
    //观察集合
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    /**
     * 添加观差者
     *
     * @param observer
     */
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 发布天气预报
     *
     * @param msg
     */
    @Override
    public void sendWeatherMessage(String msg) {
        for (Observer observer:observerList){
            observer.notify(msg);
        }
    }
}
