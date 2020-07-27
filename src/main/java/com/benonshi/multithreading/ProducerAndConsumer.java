package com.benonshi.multithreading;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author BenOniShi
 * @date 2020/7/28 1:21
 */
public class ProducerAndConsumer {

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        new Thread(producer::run).start();
        new Thread(consumer::run).start();
    }
}

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                buffer.addMessage(new Message("第" + i + "条消息"));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true){
            try {
                buffer.pollMessage();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Buffer {
    private Queue<Message> messageQueue = new LinkedList<>();
    private Integer size = 5;

    public synchronized void addMessage(Message message) throws InterruptedException {
        if (messageQueue.size() > size) {
            wait();
        }
        messageQueue.add(message);
        notify();
    }

    public synchronized void pollMessage() throws InterruptedException {
        if (messageQueue.size() == 0) {
            wait();
        }
        Message poll = messageQueue.poll();
        System.out.println(poll);
        notify();
    }


}

class Message {
    private String body;

    public Message(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Message{" +
                "body='" + body + '\'' +
                '}';
    }
}