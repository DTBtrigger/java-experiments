package com.example01.resourse;

import com.example01.entity.Apple;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtils {
    private static final List<Apple> APPLES = create();
    private static  List<Apple> apples2 = create2();
    private static List<Apple> create(){
        Apple a = new Apple(1, Apple.Color.RED,200);
        Apple a2 = new Apple(2, Apple.Color.GREEN,250);
        Apple a3 = new Apple(3, Apple.Color.RED,260);
        Apple a4 = new Apple(4, Apple.Color.GREEN,230);
        return List.of(a,a2,a3,a4);
    }
    private static List<Apple> create2(){
        List<Apple> apples2 = new ArrayList<Apple>();
        Apple a = new Apple(1, Apple.Color.RED,200);
        Apple a2 = new Apple(2, Apple.Color.GREEN,250);
        Apple a3 = new Apple(3, Apple.Color.RED,260);
        Apple a4 = new Apple(4, Apple.Color.GREEN,230);
        apples2.add(a);
        apples2.add(a2);
        apples2.add(a3);
        apples2.add(a4);
        return apples2;
    }
    public static List<Apple> appleList(){
        return APPLES;
    }
    public static List<Apple> appleList2(){
        return apples2;
    }

}
