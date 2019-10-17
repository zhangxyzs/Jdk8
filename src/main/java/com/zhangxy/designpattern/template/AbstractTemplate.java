package com.zhangxy.designpattern.template;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public abstract  class AbstractTemplate implements Template{
    private boolean alarm=false;

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    @Override
    public void run() {
        //启动
        this.start();
        //引擎轰隆
        this.engineBoom();
        //鸣笛
        if(alarm) {
            this.alerm();
        }
        //快速pao
        this.fastRun();
        //停止
        this.stop();
        
    }

    protected abstract void stop();

    protected abstract void fastRun();

    protected abstract void alerm();

    protected abstract void engineBoom();

    protected abstract void start();
}
