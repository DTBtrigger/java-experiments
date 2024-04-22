package com.experiment02;

public class User {
    private String name;
    private double balance;
    private String address;

    public User(String name, double balance, String address)
    {
        this.name = name;
        this.balance = balance;
        this.address = address;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void getName()
    {
        System.out.println(this.name);
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
//        System.out.println(this.balance);
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
}
