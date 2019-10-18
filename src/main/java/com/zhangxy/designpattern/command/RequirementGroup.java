package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class RequirementGroup implements Group {
    @Override
    public void find() {
        System.out.println("找的需求组");
    }

    @Override
    public void add() {
        System.out.println("需求组添加需求");
    }

    @Override
    public void delete() {
        System.out.println("需求组删除需求");
    }
}
