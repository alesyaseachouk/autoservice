package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.detail.Detail;

import java.util.List;

public class Storage {

    private List<Detail> details;

    public Storage() {
    }

    public Storage(List<Detail> details) {
        this.details = details;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
