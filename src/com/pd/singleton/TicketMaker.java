package com.pd.singleton;

public class TicketMaker {
    private int ticket = 1000;

    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        for (int i = 0; i < 1000000; i++) {
            System.out.print(i);
        }
        System.out.println("init");
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return getInstance().ticket++;
    }
}
