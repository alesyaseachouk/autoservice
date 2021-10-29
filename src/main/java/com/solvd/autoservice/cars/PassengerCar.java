package com.solvd.autoservice.cars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PassengerCar extends Car {

    private static final Logger LOGGER = LogManager.getLogger(PassengerCar.class);

    public PassengerCar(String carBrand, String carModel, String vinCode, int maxSpeed, int passengersCount) {
        super(carBrand, carModel, vinCode, maxSpeed, passengersCount);
    }

    @Override
    public int getMaxSpeed() {
        LOGGER.info(" I accelerate quickly because I am a passenger car. My max speed " + super.getMaxSpeed());
        return super.getMaxSpeed();
    }

    public String toString() {
        return " Vin Code " + getVinCode() + ";" + super.toString();
    }
}
