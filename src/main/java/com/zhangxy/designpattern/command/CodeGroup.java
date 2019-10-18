package com.zhangxy.designpattern.command;

/**
 * @author zhangxy
 * @date 2019/10/18
 **/
public class CodeGroup implements Group {
    @Override
    public void find() {
        System.out.println("找的搬砖组");
    }

    @Override
    public void add() {
        System.out.println("搬砖组添加需求");
    }

    @Override
    public void delete() {
        System.out.println("搬砖组删除需求");
    }
}
