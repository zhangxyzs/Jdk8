package com.zhangxy;

import com.zhangxy.juc.map.Person;
import java.util.Comparator;

/**
 * @author zhangxy
 * @date 2019/10/16
 **/
public class TreeMapComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()>o2.getAge()?1: o1.getAge()==o2.getAge()?0:-1;
    }
}
