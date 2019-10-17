package com.zhangxy.designpattern.template;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public class TemplateTest {
    public static void main(String[] args) {
        BmwCar bmwCar=new BmwCar();
        bmwCar.setAlarm(true);
        bmwCar.run();
        HafuCar hafuCar=new HafuCar();
        hafuCar.setAlarm(false);
        hafuCar.run();
    }
}
