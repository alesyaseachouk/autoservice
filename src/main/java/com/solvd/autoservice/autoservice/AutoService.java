package com.solvd.autoservice.autoservice;

import com.solvd.autoservice.client.Client;
import com.solvd.autoservice.employee.Employee;
import com.solvd.autoservice.exceptions.WrongStorageNumberException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class AutoService {

    private static final Logger LOGGER = LogManager.getLogger(AutoService.class);

    private static int storageNumber;

    private List<Employee> employees;
    private List<Client> clients;
    private List<Order> orders;

    public static void getStorageNumber(){
        LOGGER.info(" Storage Number  " + storageNumber);
    }

    public static void setStorageNumber(int storageNumber) throws WrongStorageNumberException {
        if (storageNumber < 2) {
            throw new WrongStorageNumberException(" Wrong Storage Number ");
        }
        AutoService.storageNumber = storageNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

}