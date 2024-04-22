package com.experiment02;

public class Item {
    private Product product;
    private int number;

    public Item(Product product, int number)
    {
        this.product = product;
        this.number = number;
    }

    public void setProduct( Product product)
    {
        this.product = product;
    }

    public  Product getProduct()
    {
        return product;
    }
    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public static class Main {
        public static void main(String[] args) {
            //创建用户
            User user = new User("Alice", 1000.0, "黑龙江省哈尔滨市");

            // 创造商品
            Product product1 = new Product("红楼梦", 50.0);
            Product product2 = new Product("西游记", 75.0);

            // 创造购买商品
            Item item1 = new Item(product1, 2);
            Item item2 = new Item(product2, 1);

            // Adding items to a list
            Item[] items = new Item[2];
            items[0] = item1;
            items[1] = item2;

            //创建订单
            Order order = OrderService.addOrder(user, items);
            if (order != null) {
                System.out.println("订单创建成功!");
                System.out.println("总价: " + order.getTotal());
                System.out.println("用户余额: " + user.getBalance());
                System.out.println("用户地址: " + user.getAddress());
            } else {
                System.out.println("用户余额不足");
            }
        }
    }
}
