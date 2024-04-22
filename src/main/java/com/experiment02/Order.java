package com.experiment02;

public class Order {
    private User user;
    private Item[] items;
    private double total;

    public Order(User user, Item[] items, double total)
    {
        this.user = user;
        this.items = items;
        this.total = total;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public Item[] getItems()
    {
        return items;
    }

    public void setItems(Item[] items)
    {
        this.items = items;
    }

    public double getTotal()
    {
        return total;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }
}
