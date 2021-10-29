package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.employee.Manager;

import java.util.List;

public class Corporate<K>{

    private List<K> employees;

    public <M extends Manager> M gettingCorporate(M corporateForManager) {
        return corporateForManager;
    }

    public List<K> getEmployees() {
        return employees;
    }

    public void setEmployees(List<K> employees) {
        this.employees = employees;
    }
}

