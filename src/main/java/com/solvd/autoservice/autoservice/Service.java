package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.employee.Employee;
import com.solvd.autoservice.interfaces.Executable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Service implements Executable {

    private static final Logger LOGGER = LogManager.getLogger(Service.class);

    private String serviceName;
    private int hours;
    private Employee employee;

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public void carDismantling(int hours) {
        LOGGER.info( "disassembly time " + hours);
    }

    @Override
    public void changingDetails(int hours) {
        LOGGER.info( "disassembly time " + hours);
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String toString() {
        return " It takes " + getHours() + ";" + super.toString();
    }

}
