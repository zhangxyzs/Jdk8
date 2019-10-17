package com.zhangxy.designpattern.chain;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public class ChainTest {
    public static void main(String[] args) {
        Request request=new Request();
        request.setLevel(LevelEnum.JUZHANG.getLevel());
        request.setRequest("测试请求");
        BuZhangHandler buZhangHandler=new BuZhangHandler();
        buZhangHandler.setLevel(1);
        JuZhangHandler juZhangHandler=new JuZhangHandler();
        juZhangHandler.setLevel(2);
        ChuZhangHandler chuZhangHandler=new ChuZhangHandler();
        chuZhangHandler.setLevel(3);
        buZhangHandler.setHandler(juZhangHandler);
        juZhangHandler.setHandler(chuZhangHandler);
        buZhangHandler.handleRequest(request);
    }
}
