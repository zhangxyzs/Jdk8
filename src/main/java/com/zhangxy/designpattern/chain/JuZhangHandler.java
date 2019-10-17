package com.zhangxy.designpattern.chain;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public class JuZhangHandler extends AbstractHandler {
    @Override
    public void execute(Request request) {
        System.out.println("请求消息为："+request.getRequest()+"，"+LevelEnum.getDecs(request.getLevel())+"处理意见：同意");
    }}
