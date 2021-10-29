package com.solvd.autoservice.cars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Truck extends Car {

    private static final Logger LOGGER = LogManager.getLogger(Truck.class);

    private Double capacityVolumeBody;

    public Truck(String carBrand, String carModel, String vinCode, int maxSpeed, int passengersCount) {
        super(carBrand, carModel, vinCode, maxSpeed, passengersCount);
    }

    @Override
    public int getMaxSpeed() {
        LOGGER.info("I accelerate a little slower because I am truck. My max speed " + super.getMaxSpeed());
        return super.getMaxSpeed();
    }

    @Override
    public void carryPassengers() {
        LOGGER.info("I'm a truck. I don't like the basic behavior. I want to carry more people than there are seats " + getPassengersCount());
    }

    public Double getCapacityVolumeBody() {
        return capacityVolumeBody;
    }

    public void setCapacityVolumeBody(Double capacityVolumeBody) {
        this.capacityVolumeBody = capacityVolumeBody;
    }

    public String toString() {
        return " Capacity Volume Body  " + getCapacityVolumeBody() + ";" + super.toString();
    }
}