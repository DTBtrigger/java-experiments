package com.experiment02;

public class OrderService {
    public static Order addOrder(User user, Item[] items) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getProduct().getPrice() * item.getNumber();
        }
        if (user.getBalance() >= total) {
            Order order = new Order(user, items, total);
            user.setBalance(user.getBalance() - total);
            return order;
        } else {
            return null;
        }
    }
}
