package com.zhangxy.stream;

import org.junit.Before;
import org.junit.Test;

/**
 * 测试
 *
 * @author zhangxy
 * @date 2019/10/10
 **/
public class StreamApiTest {
    private StreamApi streamApi=null;
    @Before
    public void init(){
        streamApi=new StreamApi();
    }
    @Test
    public void filterAge(){
        streamApi.filterAge();
    }
    @Test
    public void mapList(){
        streamApi.mapList();
    }
    @Test
    public void flatMapString(){
        streamApi.flatMapString();
    }
    @Test
    public void reduceTest(){
        streamApi.reduceTest();
    }
    @Test
    public void collectTest(){
        streamApi.collectTest();
    }

}
