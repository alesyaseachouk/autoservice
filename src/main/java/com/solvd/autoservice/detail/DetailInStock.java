package com.solvd.autoservice.detail;

public class DetailInStock {

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

