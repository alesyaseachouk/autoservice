package com.solvd.autoservice.cars;

import com.solvd.autoservice.interfaces.Washable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Motorbike extends Car implements Washable {

    private static final Logger LOGGER = LogManager.getLogger(Motorbike.class);

    public Motorbike(String carBrand, String carModel, String vinCode, int maxSpeed, int passengersCount) {
        super(carBrand, carModel, vinCode, maxSpeed, passengersCount);
    }

    @Override
    public int getMaxSpeed() {
        LOGGER.info(" I can drive fast. My max speed is " + super.getMaxSpeed());
        return super.getMaxSpeed();
    }

    @Override
    public void carryPassengers() {
        System.out.println( " The fastest " );
    }


    @Override
    public void takeWashingThings(String carBrand) {
        LOGGER.info(" Take washing things for " + carBrand);
    }

    @Override
    public void applySpecialAgent(String carBrand) {
        LOGGER.info(" Apply the agent for " + carBrand);
    }

    @Override
    public void washWater(String carBrand) {
        LOGGER.info(" Washing by water " + carBrand);
    }
}
