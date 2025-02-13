package com.example01.service;

import com.example01.entity.Apple;
import com.example01.resourse.DatabaseUtils;
import com.homework.StudentTest;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AppleService {
    public static List<Apple> listApplesByColor(Apple.Color c){
        List<Apple> colorApple = new ArrayList<Apple>();
        for(Apple a : DatabaseUtils.appleList()){
            if( c.equals(a.getColor())){
                colorApple.add(a);
            }
        }
        return colorApple;
    }
    public static List<Apple> listAppleByColor2(Apple.Color c){
        return DatabaseUtils.appleList()
                .stream()
                .filter(a -> c.equals(a.getColor()))
                .collect(Collectors.toList());
    }
    public static List<Apple> listAppleByColorAndWeight(Apple.Color c, int w){
        return DatabaseUtils.appleList()
                .stream()
                .filter(a -> c.equals(a.getColor()))
                .filter(a -> w >= a.getWeight())
                .collect(Collectors.toList());
    }
    public static void sortByWeight(){
         DatabaseUtils.appleList()
                .stream()
                .sorted(Comparator.comparing(Apple::getWeight))
                .collect(Collectors.toList())
                 .forEach(a -> System.out.println(a.toString()));
    }
    public static void getApple(){
        Iterator<Apple> iApple = DatabaseUtils.appleList().listIterator();
        while (iApple.hasNext()){
            System.out.println(iApple.next().toString());
        }
    }
    public static void getApple2(){
        Iterator<Apple> iApple = DatabaseUtils.appleList2().iterator();
        while (iApple.hasNext()){
            System.out.println(iApple.next().toString());
        }
    }
    public static void removeApple(){
        Iterator<Apple> iApple = DatabaseUtils.appleList2().iterator();
        while (iApple.hasNext()){
            if(iApple.next().getWeight() == 200){
                iApple.remove();
            }
        }
        //Iterator只迭代一次，指针走到尽头，在下一次使用时不会回到第一个元素
        Iterator<Apple> iApple2 = DatabaseUtils.appleList2().iterator();
        while (iApple2.hasNext()){
            System.out.println(iApple2.next().toString());
        }
    }
    public static void removeApple2(){
        DatabaseUtils.appleList2( ).removeIf( a -> a.getWeight() == 230);
        DatabaseUtils.appleList2().forEach( a -> System.out.println(a.toString()));
    }
    public static void main(String[] args){
//        for(Apple a : DatabaseUtils.appleList()){
//            System.out.println(a.toString());
//        }
//        System.out.println("------------------------------------");
//        DatabaseUtils.appleList().forEach(a -> {
//            System.out.println(a.toString());
//        });
//        System.out.println("------------------------------------");
//        for(Apple a : listApplesByColor(Apple.Color.RED)){
//            System.out.println(a.toString());
//        }
//        System.out.println("------------------------------------");
//        for (Apple a : listAppleByColor2(Apple.Color.GREEN)){
//            System.out.println(a.toString());
//        }
//        System.out.println("------------------------------------");
//        for(Apple a : listAppleByColorAndWeight(Apple.Color.RED, 230)){
//            System.out.println(a.toString());
//        }
//        System.out.println("------------------------------------");
//        sortByWeight();
//        System.out.println("------------------------------------");
        getApple2();
        System.out.println("------------------------------------");
        //removeApple();
        System.out.println("------------------------------------");
        //getApple2();
        System.out.println("------------------------------------");
        removeApple2();
        System.out.println("------------------------------------");
        getApple2();
    }
}
