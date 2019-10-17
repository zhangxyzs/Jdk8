package com.zhangxy.designpattern.chain;

import java.util.HashMap;
import java.util.Map;

public enum LevelEnum {
    CHUZHANG(1,"处长"),
    JUZHANG(2,"局长"),
    BUZHANG(3,"部长");
    private int level;
    private String decs;
    private static Map<Integer,LevelEnum> map=new HashMap<>();
    static {
        for(LevelEnum levelEnum:values()){
            map.put(levelEnum.getLevel(),levelEnum);
        }
    }
    LevelEnum(int level, String decs) {
        this.level = level;
        this.decs = decs;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
    public static String getDecs(int code){
        return  map.get(code).getDecs();
    }
}
