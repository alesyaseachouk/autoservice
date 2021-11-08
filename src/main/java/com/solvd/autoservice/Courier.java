package com.solvd.autoservice;

public class Courier {
    private static int i;
    String name;

    public Courier() {
    }

    Courier(String name) {
        this.name = name;
    }
    public String doingDelivery(String name) {
        System.out.println(" This is " + name);
        return name;
    }
}
