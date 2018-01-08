package com.pd.singleton;

/**
 * ceshi
 *
 * @author zhaoyan
 * @since 2018.01.05 17:02
 */
public class TicketMain implements Runnable {
    @Override
    public void run() {
        TicketMaker ticketMaker = TicketMaker.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+ticketMaker.hashCode());

    }

    public static void main(String[] args) {
        Thread m1 = new Thread(new TicketMain(),"1");
        Thread m2 = new Thread(new TicketMain(),"2");
        Thread m3 = new Thread(new TicketMain(),"3");
        Thread m4 = new Thread(new TicketMain(),"4");
        Thread m5 = new Thread(new TicketMain(),"5");
        Thread m6 = new Thread(new TicketMain(),"6");
        Thread m7 = new Thread(new TicketMain(),"7");
        Thread m8 = new Thread(new TicketMain(),"8");
        Thread m9 = new Thread(new TicketMain(),"9");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
        m8.start();
        m9.start();
    }
}
