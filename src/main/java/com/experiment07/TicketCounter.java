package com.experiment07;

import java.util.ArrayList;
import java.util.List;

public class TicketCounter implements Runnable {
    private final String name;
    private final RailwayDepartment department;
    private List<Ticket> soldTickets = new ArrayList<>();

    public TicketCounter(String name, RailwayDepartment department) {
        this.name = name;
        this.department = department;
    }

    public void run() {
        while (true) {
            Ticket ticket = department.getTicket();
            if (ticket == null) {
                break;
            }
            soldTickets.add(ticket);
            try {
                Thread.sleep((long) (Math.random() * 50));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Ticket counter " + name + " 卖了 " + soldTickets.size() + " 张票.");
    }
}

