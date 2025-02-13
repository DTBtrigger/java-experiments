package com.experiment07;

public class Test {
    public static void main(String[] args) {
        RailwayDepartment department = new RailwayDepartment(200);

        Thread counter1 = new Thread(new TicketCounter("售票点1", department));
        Thread counter2 = new Thread(new TicketCounter("售票点2", department));
        Thread counter3 = new Thread(new TicketCounter("售票点3", department));

        counter1.start();
        counter2.start();
        counter3.start();

        try {
            counter1.join();
            counter2.join();
            counter3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("票已售罄.");
    }
}

