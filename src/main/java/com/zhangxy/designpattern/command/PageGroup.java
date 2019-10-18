package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class PageGroup implements Group {
    @Override
    public void find() {
        System.out.println("找的页面组");
    }

    @Override
    public void add() {
        System.out.println("页面组添加需求");
    }

    @Override
    public void delete() {
        System.out.println("页面组删除需求");
    }
}
