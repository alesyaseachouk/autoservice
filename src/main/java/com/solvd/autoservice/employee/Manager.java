package com.solvd.autoservice.employee;

public class Manager extends Employee{

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString() {
        return " Manager today is " + getFirstName() + " " + super.toString();
    }

}
