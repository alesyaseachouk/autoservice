package com.solvd.autoservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Customer extends Thread {

    private static final Logger LOGGER = LogManager.getLogger(Customer.class);

    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info(" Customer " + getName() + " was started ");
    }
}
