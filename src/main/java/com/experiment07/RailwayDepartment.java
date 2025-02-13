package com.experiment07;

public class RailwayDepartment {
    private final Ticket[] tickets;
    private int nextTicketIndex;

    public RailwayDepartment(int numberOfTickets) {
        tickets = new Ticket[numberOfTickets];
        for (int i = 0; i < numberOfTickets; i++) {
            tickets[i] = new Ticket(i + 1, "哈尔滨", "北京");
        }
        nextTicketIndex = 0;
    }

    public synchronized Ticket getTicket() {
        if (nextTicketIndex < tickets.length) {
            Ticket ticket = tickets[nextTicketIndex];
            nextTicketIndex++;
            return ticket;
        } else {
            return null;
        }
    }
}

