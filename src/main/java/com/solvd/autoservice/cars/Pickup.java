package com.solvd.autoservice.cars;

import com.solvd.autoservice.interfaces.Drivable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Pickup implements Drivable {

    private static final Logger LOGGER = LogManager.getLogger(Pickup.class);

    private String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void openDoor(String carBrand) {
        LOGGER.info( " Pick up door is opened");
    }

    @Override
    public void getInCar(String carBrand) {
        System.out.println(" Get in Pickup ");
    }

    @Override
    public void closeDoor(String carBrand) {
        System.out.println( "Pick up door is closed");
    }
}
