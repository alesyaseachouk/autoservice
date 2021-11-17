package com.solvd.autoservice;

public class Connection {

    public void create() {
        System.out.println("Order is created");
        sleep();
    }
    public void read() {
        System.out.println("Order reading");
        sleep();
    }
    public void update() {
        System.out.println("Updating order info");
        sleep();
    }
    public void delete() {
        System.out.println("Deleting order");
        sleep();
    }

    private void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

