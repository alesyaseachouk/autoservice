package com.solvd.autoservice.cars;

public class CarBrand {

    private Brand brand;

    public enum Brand{
        MERCEDES, AUDI, BMW;
    }

    public Brand getBrand(){
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}