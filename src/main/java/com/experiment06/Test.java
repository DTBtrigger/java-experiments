package com.experiment06;

import com.experiment06.exceptions.OverLoadException;

public class Test {
    public static void main(String[] args){
        Ship ship = new Ship(1,"万里阳光号",1000);
        Container[] containers = {
                new Container(1,200),
                new Container(2,300),
                new Container(2,600)
        };
        try {
            ship = Load.loadContainers(ship,containers);
            System.out.println("Ship: " + ship.getName()+"准备出发");
        }catch (OverLoadException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("出发！");
        }
    }
}
