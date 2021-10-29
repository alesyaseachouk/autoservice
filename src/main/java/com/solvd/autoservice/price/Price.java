package com.solvd.autoservice.price;

import com.solvd.autoservice.autoservice.Service;
import com.solvd.autoservice.detail.Detail;

import java.util.List;

public abstract class Price {

    private List<Detail> details;
    private List<Service> services;

    public Price(List<Detail> details, List<Service> services) {
        this.details = details;
        this.services = services;
    }

    public Price(List<Detail> details) {
        this.details = details;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
