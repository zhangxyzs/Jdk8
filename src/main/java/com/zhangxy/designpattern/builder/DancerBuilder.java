package com.zhangxy.designpattern.builder;

import lombok.Data;

/**
 * 跳舞机器人构造
 *
 * @author zhangxy
 * @date 2019/10/17
 **/
@Data
public class DancerBuilder implements Ibuilder {
    private Robbit robbit;

    public DancerBuilder(Robbit robbit) {
        this.robbit = robbit;
    }

    @Override
    public void builderHead() {
        robbit.setHead("跳舞头");
    }

    @Override
    public void builderHand() {
        robbit.setHand("跳舞手");
    }

    @Override
    public void builderBody() {
        robbit.setBody("跳舞身体");
    }

    @Override
    public void builderFoot() {
        robbit.setFoot("跳舞脚");
    }

    @Override
    public Robbit createRobbit() {
        return robbit;
    }
}
