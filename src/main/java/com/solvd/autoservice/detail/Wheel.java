package com.solvd.autoservice.detail;

public enum Wheel {
    R15(" Radius 15 "),
    R17(" Radius 17 ");

    private final String name;

    Wheel(String name) {
        this.name = name;
    }

    public static Wheel showWheelRadius(String name) {
        Wheel result = R15;
        for (Wheel wheel1 : Wheel.values()){
            if (wheel1.getName().equals(name)){
                result = wheel1;
                break;
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }
}
