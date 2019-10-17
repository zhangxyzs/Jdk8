package com.zhangxy.designpattern.observe;

/**
 * 被观察者接口
 */
public interface Observed {
    /**
     * 添加观差者
     * @param observer
     */
    void addObserver(Observer observer);
    /**
     * 发布天气预报
     */
    void sendWeatherMessage(String msg);
}
