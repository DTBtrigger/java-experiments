package com.experiment03;


public class Manager extends Employee{
    private int level;

    public Manager(String name, double basicSalary, int level){
        super(name, basicSalary);
        this.level = level;
    }

    public double calculateSalary(){
        return super.calculateSalary() * level * 0.8;
    }
}
