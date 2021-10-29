package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.cars.Car;
import com.solvd.autoservice.cars.Minivan;
import com.solvd.autoservice.client.Client;

import java.util.List;

public class Discount<D extends Car, C extends Client> {

    private List<D> cars;
    private List<C> clients;

    public <T extends Minivan> T gettingDiscount (T discountForMinivan) {
        return discountForMinivan;
    }

    public List<D> getCars() {
        return cars;
    }

    public void setCars(List<D> cars) {
        this.cars = cars;
    }

    public List<C> getClients() {
        return clients;
    }

    public void setClients(List<C> clients) {
        this.clients = clients;
    }
}
