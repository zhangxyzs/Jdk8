package com.zhangxy.juc;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashMap测试
 *
 * @author zhangxy
 * @date 2019/10/14
 **/
public class HashMapTest {
    public static void main(String[] args) {
        //没有顺序
/*        Map<String,Object> map=new HashMap<String,Object>();
        for (int i=0;i<100;i++){
            map.put(i+"",i);
        }
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }*/
        //有顺序
/*        Map<String, Object> map1 = new LinkedHashMap<>(256, 0.75f, true);
        for (int i = 0; i < 100; i++) {
            map1.put(i + "", i);
        }
        Iterator<Map.Entry<String, Object>> iterator1 = map1.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Object> next = iterator1.next();
            System.out.println(next.getKey() + ":" + map1.get(next.getKey()));
        }*/
        testTreeMap();
    }

    public static void testTreeMap() {
        Map<Student, Float> map = new TreeMap<>();
        Student student1=new Student("student1",19);
        Student student2=new Student("student2",20);
        Student student3=new Student("student3",22);
        Student student4=new Student("student4",15);
        map.put(student1,19f);
        map.put(student2,20f);
        map.put(student3,22f);
        map.put(student4,15f);
        Iterator<Map.Entry<Student, Float>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Student, Float> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
    }

    public static class Student implements Comparable<Student> {
        private String name;
        private Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public int compareTo(Student o) {
            if (this.age > o.age) {
                return 1;
            } else if (this.age < o.age) {
                return -1;
            }
            return 0;
        }
    }
}
