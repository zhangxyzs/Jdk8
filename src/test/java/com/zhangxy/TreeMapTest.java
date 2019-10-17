package com.zhangxy;

import com.zhangxy.juc.map.Person;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Test;

/**
 * @author zhangxy
 * @date 2019/10/16
 **/
public class TreeMapTest {
    @Test
    public void TreeMapComparator(){
        Map<Person, Float> map = new TreeMap<>(new TreeMapComparator());
        Person student1=new Person("student1",19,"man");
        Person student2=new Person("student1",18,"man");
        Person student3=new Person("student1",14,"man");
        Person student4=new Person("student1",120,"man");
        map.put(student1,19f);
        map.put(student2,20f);
        map.put(student3,22f);
        map.put(student4,15f);
        Iterator<Map.Entry<Person, Float>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Person, Float> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }
}
