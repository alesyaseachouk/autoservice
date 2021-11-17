package com.solvd.autoservice.detail;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DetailInStock extends Thread{

    private static final Logger LOGGER = LogManager.getLogger(DetailInStock.class);

    private Wheel wheel;

    public enum Detail {
        R15, R17
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}

