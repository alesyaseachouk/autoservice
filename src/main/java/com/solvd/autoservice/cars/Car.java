package com.solvd.autoservice.cars;

import com.solvd.autoservice.interfaces.Acceleratable;
import com.solvd.autoservice.interfaces.Drivable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public abstract class Car implements Drivable, Acceleratable {

    private static final Logger LOGGER = LogManager.getLogger(Car.class);

    private String carBrand;
    private String carModel;
    private String vinCode;
    private int maxSpeed;
    private int passengersCount;

    public Car() {
    }

    @Override
    public void openDoor(String carBrand) {
        LOGGER.info(" The door is opened " + carBrand);
    }

    @Override
    public void getInCar(String carBrand) {
        LOGGER.info(" Happy to see you in the car " + carBrand);
    }

    @Override
    public void closeDoor(String carBrand) {
        LOGGER.info(" The door is closed " + carBrand);
    }

    @Override
    public void startingEngine(String carModel) {
        LOGGER.info(" The engine is started " + carBrand);
    }

    @Override
    public void acceleration(int maxSpeed) {
        LOGGER.info(" Acceleration depends on max speed " + maxSpeed);
    }

    @Override
    public void inertia(String arModel) {
        LOGGER.info(" Acceleration depends on car brand " + carBrand);
    }

    public Car(String carBrand, String carModel, String vinCode, int maxSpeed, int passengersCount) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.vinCode = vinCode;
        this.maxSpeed = maxSpeed;
        this.passengersCount = passengersCount;
    }

    public void carryPassengers(){
        LOGGER.info( "I can drive " + passengersCount + " With Max Speed " + maxSpeed);
    }

    @Override
    public String toString() {
        return " CarBrand " + carBrand + " CarModel " + carModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return vinCode != null ? vinCode.equals(car.vinCode) : car.vinCode == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinCode);
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getVinCode() {
        return vinCode;
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



}
