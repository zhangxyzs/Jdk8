package com.zhangxy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/**
 * stream流应用
 *
 * @author zhangxy
 * @date 2019/10/10
 **/
public class StreamApi {
    private static List<Person> list=null;
    static {
        Person person1=new Person("zhangsan",25,"men");
        Person person2=new Person("lisi",21,"men");
        Person person3=new Person("wanwu",28,"men");
        Person person4=new Person("lihua",25,"women");
        Person person5=new Person("qiansan",23,"men");
        Person person6=new Person("wangxiaoyu",23,"women");
        list = Arrays.asList(person1, person2, person3, person4, person5, person6);
    }
    public List<Person> getData(){
        return list;
    }
    /**
     * filter 的用法
     */
    public void filterAge(){
        List<Person> list=getData();
        List<Person> temp=new ArrayList<>();
        //old way
        for(Person person:list){
            if("men".equals(person.getSex())){
                temp.add(person);
            }
        }
        System.out.println("old way"+temp);
        //new way
        List<Person> collect = list.parallelStream().filter(person -> {
            if ("men".equals(person.getSex())) {
                return true;
            } else {
                return false;
            }
        }).collect(toList());
        System.out.println("new way"+collect);
        List<Person> collect1 = list.parallelStream().filter(person -> ("men".equals(person.getSex()))).collect(toList());
        System.out.println("new way"+collect1);
    }

    /**
     * map生成的是个一对一映射,for的作用
     */
    public void mapList(){
        List<Person> list=getData();
        //new way1
        List<String> collect1 = list.parallelStream().map(person -> person.getName()).collect(toList());
        System.out.println("new way1"+collect1);
        //new way2
        List<String> collect2 = list.parallelStream().map(Person::getName).collect(toList());
        System.out.println("new way2"+collect2);
        List<String> collect3 = list.parallelStream().map(person -> {
            return person.getName();
        }).collect(toList());
        System.out.println("new way3"+collect3);
    }
    public void flatMapString() {
        List<Person> list = getData();
        List<String> collect = list.parallelStream().flatMap(person -> Arrays.stream(person.getName().split(" "))
        ).collect(toList());
        System.out.println("flatMap"+collect);
//        List<String> collect1 = list.parallelStream().map(person -> Arrays.stream(person.getName().split(" "))
//                .flatMap(Arrays::stream)
//
//        .collect(Collectors.toList());
        List<String> collect1 = list.parallelStream().map(person -> person.getName().split(" "))
                .flatMap(Arrays::stream).collect(toList());
        System.out.println("map"+collect1);
    }
    public static void reduceTest(){
        //累加，初始化值是 10
        Integer reduce = Stream.of(1, 2, 3, 4)
                .reduce(10, (sum, item) ->{
                    System.out.println("count:"+sum);
                    System.out.println("item:"+item);
                    return sum + item;
                } );
        System.out.println(reduce);

        Integer reduce1 = Stream.of(1, 2, 3, 4)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce1);

        String reduce2 = Stream.of("1", "2", "3")
                .reduce("0", (x, y) -> (x + "," + y));
        System.out.println(reduce2);
    }
    public void collectTest(){
        List<Person> data = getData();
        //转化为list
        List<String> collect = data.parallelStream().map(person -> person.getName()).collect(toList());
        System.out.println("toList"+collect);
        //转化为set
        Set<String> collect1 = data.parallelStream().map(person -> person.getName()).collect(toSet());
        System.out.println("toSet"+collect1);
        //分隔
        String collect2 = data.stream().map(person -> person.getName()).collect(Collectors.joining());
        System.out.println("joining"+collect2);
        //joiningzhangsanlisiwanwulihuaqiansanwangxiaoyu
        String collect3 = data.stream().map(person -> person.getName()).collect(Collectors.joining(","));
        System.out.println("joining"+collect3);
        //joiningzhangsan,lisi,wanwu,lihua,qiansan,wangxiaoyu
        String collect4 = data.stream().map(person -> person.getName()).collect(Collectors.joining(",","{","}"));
        System.out.println("joining"+collect4);
        //joining{zhangsan,lisi,wanwu,lihua,qiansan,wangxiaoyu}
        Map<Boolean, List<Person>> collect6 = data.stream().collect(Collectors.groupingBy(person -> "men".equals(person.getSex())));
        System.out.println("groupingBy"+collect6);
        //groupingBy{false=[Person(name=lihua, age=25, sex=women), Person(name=wangxiaoyu, age=23, sex=women)], true=[Person(name=zhangsan, age=25, sex=men), Person(name=lisi, age=21, sex=men),
        // Person(name=wanwu, age=28, sex=men), Person(name=qiansan, age=23, sex=men)]}
        //转化为map
        Map<String, Integer> collect5 = data.stream().collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println("toMap"+collect5);
        //toMap{wangxiaoyu=23, lisi=21, lihua=25, wanwu=28, zhangsan=25, qiansan=23}
        //自定义
        List<String> collect7 = Stream.of("1", "2", "3").collect(
                Collectors.reducing(new ArrayList<String>(), x -> Arrays.asList(x), (y, z) -> {
                    y.addAll(z);
                    return y;
                }));
        System.out.println(collect7);
    }
}
