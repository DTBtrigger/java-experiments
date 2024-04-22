package com.experiment03;

public class Employee implements Workable{
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary){
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void updateName(String newName){
        this.name = newName;
    }

    public double calculateSalary(){
        return basicSalary;
    }
}
