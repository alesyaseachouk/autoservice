package com.solvd.autoservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerFromRunnable implements Runnable {

    private static final Logger LOGGER = LogManager.getLogger(CustomerFromRunnable.class);

    private static volatile Integer count = 0;

    private final String firstName;
    private String lastName;

    public void getLastName() {
        this.lastName = lastName;
        LOGGER.info(this.lastName);
    }

    public CustomerFromRunnable(String name) {
        this.firstName = name;
    }

    @Override
    public void run() {
        LOGGER.info(String.format("Customer %s was started from Runnable", firstName));
    }

    public String getName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
