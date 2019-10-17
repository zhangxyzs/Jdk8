package com.zhangxy.designpattern.chain;

/**
 * @author zhangxy
 * @date 2019/10/17
 **/
public abstract class AbstractHandler implements Handler {

    private int level;

    private Handler handler;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if(this.level==request.getLevel()){
            this.execute(request);
        }else{
            if(handler!=null) {
                handler.handleRequest(request);
            }else{
                System.out.println("-----------没地方请示了， 不做处理！ ---------\n");
            }
        }
    }
    public abstract void execute(Request request);
}
