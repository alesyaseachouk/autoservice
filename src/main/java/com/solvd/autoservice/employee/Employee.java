package com.solvd.autoservice.employee;

import com.solvd.autoservice.interfaces.Workable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDateTime;

public abstract class Employee implements Workable {

    private static final Logger LOGGER = LogManager.getLogger(Employee.class);

    private String firstName;
    private String lastName;
    private LocalDateTime dob;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void getToAutoService(String firstName, String lastName) {
        LOGGER.info( " Сame to work shift " + firstName + lastName);
    }

    @Override
    public void adequacyСheck(String firstName, String lastName) {
        LOGGER.info( " Ready to go " + firstName + lastName);
    }

    @Override
    public void workAdmission(String firstName, String lastName) {
        LOGGER.info( " Started work day " + firstName + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

}
