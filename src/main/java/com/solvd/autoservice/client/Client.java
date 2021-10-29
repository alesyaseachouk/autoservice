package com.solvd.autoservice.client;

import com.solvd.autoservice.exceptions.WrongDataException;
import com.solvd.autoservice.interfaces.Profitable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Client implements Profitable {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    private String firstName;
    private String lastName;
    private String carBrand;

    public Client() {
    }

    @Override
    public void comesUp(String firstName, String lastName, String carBrand) {
        LOGGER.info( "Chooses this Auto Service " + firstName + lastName + " With the car Brand " + carBrand );
    }

    @Override
    public void doOrder(String firstName, String lastName, String carBrand) {
        LOGGER.info(" Confirms doing the order " + firstName + lastName + carBrand);
    }

    @Override
    public void givingMoney(String firstName) {
        System.out.println("  Pays the bill " + firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(lastName.contains("_")) {
            throw new WrongDataException(" First name is invalid ");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.contains("_")) {
            throw new WrongDataException(" Last name is invalid ");
        }
        this.lastName = lastName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

}
