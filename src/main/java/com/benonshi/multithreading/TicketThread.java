package com.benonshi.multithreading;

import lombok.SneakyThrows;

/**
 * 模拟卖票
 *
 * @author BenOniShi
 * @date 2020/5/31 22:27
 */
public class TicketThread implements Runnable {



    private volatile Integer ticket = 500;
    private String title;

    public TicketThread(String title) {
        this.title = title;
    }

    public TicketThread() {
    }

    public Integer getTicket() {
        return ticket;
    }

    @SneakyThrows
    @Override
    public  synchronized void run() {
        while (this.ticket > 0) {
            this.notifyAll();
            this.ticket--;
            System.out.println(Thread.currentThread().getName() + "正在卖票,当前还有【" + this.ticket + "】张票");
            this.wait();
        }
    }
    }

class Purchase {

    public static void main(String[] args) {
        TicketThread ticketThread = new TicketThread();
        new Thread(ticketThread, "1售票员").start();
        new Thread(ticketThread, "2售票员").start();



    }
}
