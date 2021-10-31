package com.solvd.autoservice;

import com.solvd.autoservice.autoservice.*;
import com.solvd.autoservice.cars.*;
import com.solvd.autoservice.client.*;
import com.solvd.autoservice.detail.BodyPart;
import com.solvd.autoservice.detail.Detail;
import com.solvd.autoservice.detail.DetailInStock;
import com.solvd.autoservice.detail.Wheel;
import com.solvd.autoservice.employee.Employee;
import com.solvd.autoservice.employee.Manager;
import com.solvd.autoservice.employee.StorageWorker;
import com.solvd.autoservice.exceptions.WrongStorageNumberException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        IndividualClient client1 = new IndividualClient("Petr", "Petrov", "mercedes");
        IndividualClient client22 = new IndividualClient("Ivan", "Orlov", "gaz");
        BodyPart wheel = new BodyPart("wheel", 100, true);
        BodyPart mirror = new BodyPart("mirror", 233, true);
        BodyPart mirror2 = new BodyPart("mirror2", 233, true);
        IndividualClient client2 = new IndividualClient("UT_z", " _ ", "BMW");
        IndividualClient client26 = new IndividualClient("Konstantin", " Igorov ", "Audi");
        IndividualClient client48 = new IndividualClient("UT_z", " _ ", "BMW");

        DetailInStock detailInStock = new DetailInStock();
        detailInStock.setWheel(Wheel.R15);
        LOGGER.info(Wheel.R15.getName());
        LOGGER.info(Wheel.R15.name());

        for (Wheel wheel1 : Wheel.values()) {
            LOGGER.info(wheel1.name());
        }

        String name = " R15 ";
        Wheel showWheelRadius = Wheel.showWheelRadius(name);
        LOGGER.info(Wheel.showWheelRadius(name));

        String radiusWheel;
        if (Wheel.R15.equals(showWheelRadius)){
            radiusWheel = " Wheel Radius - 15 ";
        } else {
            radiusWheel = " Wheel radius - 17 ";
        }

        LOGGER.info(radiusWheel);

        switch (showWheelRadius){
            case R15:
                LOGGER.info(" Wheels R15 are in stock ");
                break;
            case R17:
                LOGGER.info(" Wheels R17 are in stock ");
                break;
            default:
                LOGGER.info(" No wheels is stock ");
                break;
        }

        CarBrand carBrand = new CarBrand();
        carBrand.setBrand(CarBrand.Brand.BMW);
        LOGGER.info(Brand.BMW.getBrandName());

        String brandName = " BMW ";
        Brand showBrandName = Brand.showBrandName(name);
        LOGGER.info(Brand.showBrandName(brandName));

        String brands;
        if (Brand.BMW.equals(showBrandName)){
            brands = " BMW ";
        }else {
            brands = " Audi ";
        }

        LOGGER.info(brands);

        OtherClient otherClient = new OtherClient();
        otherClient.setForeignClient(OtherClient.ForeignClient.ASIA);
        otherClient.setForeignClient(OtherClient.ForeignClient.USA);
        LOGGER.info(ForeignClient.USA.getClientName());
        LOGGER.info(ForeignClient.ASIA.name());

        String clientName = " American ";
        ForeignClient getClientName = ForeignClient.getClientName(clientName);
        LOGGER.info(" American " + ForeignClient.getClientName(clientName));

        switch (getClientName){
            case USA:
                LOGGER.info(" American client ");
                break;
            case ASIA:
                LOGGER.info(" Asian client ");
                break;
            case EUROPE:
                LOGGER.info(" European client");
                break;
        }

        List<Detail> details = new ArrayList<>();

        details.add(mirror);
        details.add(mirror2);
        details.add(wheel);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client22);
        clients.add(client2);

        Order order = new Order(clients, details);

        LOGGER.info(details);

        RegularClient artur = new RegularClient(1, "Artur", "Hodyakov");
        RegularClient john = new RegularClient(2, "John", "Kapustin");
        RegularClient david = new RegularClient(3, "David", "Duhovny");

        Map<Integer, RegularClient> regularClients = new HashMap<>();
        regularClients.put(artur.getId(), artur);
        regularClients.put(john.getId(), john);
        regularClients.put(david.getId(), david);
        regularClients.isEmpty();
        regularClients.size();
        regularClients.hashCode();

        for (Map.Entry<Integer, RegularClient> entry : regularClients.entrySet()) {
            LOGGER.info("ID =  " + entry.getKey() + " Regular Client Name = " + entry.getValue());
        }

        LOGGER.info(" John should be displayed " + regularClients.get(2));
        LOGGER.info(" Is empty " + regularClients.isEmpty());
        LOGGER.info(" Map Size " + regularClients.size());
        LOGGER.info(" Map HashCode " + regularClients.hashCode());

        LinkedList<BodyPart> bodyParts = new LinkedList<>();

        bodyParts.add(wheel);
        bodyParts.add(mirror);
        bodyParts.add(mirror2);

        LOGGER.info(" Linked List First " + bodyParts.getFirst());
        LOGGER.info(" Linked List Last " + bodyParts.getLast());

        Set<Client> setClients = new TreeSet<>(new Comparator<Client>() {
            @Override
            public int compare(Client o1, Client o2) {
                return 0;
            }
        });

        clients.add(client1);
        clients.add(client1);
        clients.add(client2);

        LOGGER.info(" Client from TreeSet " + clients);

        Set<Detail> setDetails = new HashSet<>();
        setDetails.add(mirror);
        setDetails.add(mirror2);
        setDetails.add(wheel);
        setDetails.add(mirror);

        LOGGER.info(details);
        LOGGER.info(details.size());
        LOGGER.info(details.isEmpty());

        order.setDetailsReplacementInMin(120);
        order.setStartDate(new Date());
        Car passengerCar = new PassengerCar("Mercedes", "S class w223", "yegfugiu3678765", 300, 4);
        Car truckCar = new Truck("Gaz", "66", "cfgvhj5678", 60, 2);
        Car bike = new Motorbike("Harley Davidson", "Iron 833", "gfcvjbk5637", 350, 1);

        List<Car> cars = new ArrayList<>();
        cars.add(passengerCar);
        cars.add(truckCar);
        cars.add(bike);
        LOGGER.info(cars);

        StorageWorker storageWorker = new StorageWorker("Feodor", "Brish");
        storageWorker.setFirstName("Anton");
        Manager manager = new Manager("Artyom", "Petrov");
        manager.setFirstName("Stas");

        Car car1FromCollection = cars.get(0);
        Car car2FromCollection = cars.get(1);
        LOGGER.info(car1FromCollection);
        LOGGER.info(car2FromCollection);

        int sum = order.getSum();
        wheel.getDetailName();
        mirror.getDetailName();
        mirror2.getDetailName();
        order.printDetails();
        AutoService.getStorageNumber();

        Minivan toyotaSienna = new Minivan("Tayota", "Siena", "jyuehc567", 180,4);
        Minivan hondaOdyssey = new Minivan("Honda", "Odyssey", "gcfwyfry55", 200, 4);
        List<Minivan> minivans = new ArrayList<>();
        minivans.add(toyotaSienna);
        minivans.add(hondaOdyssey);

        Discount<Minivan, Client> discount = new Discount<>();
        discount.setCars(minivans);

        Minivan discountForMinivan = discount.gettingDiscount(toyotaSienna);

        for (Car minivan : discount.getCars()) {
            minivan.getMaxSpeed();
            LOGGER.info(" Get max speed minivan " + minivan.getMaxSpeed());
        }

        Manager manager3 = new Manager("Andrew", "Petrov");
        Manager manager4 = new Manager("Ondrew", "Orlov");

        List<Manager> managers = new ArrayList<>();

        managers.add(manager3);
        managers.add(manager4);

        Corporate<Manager> corporate = new Corporate<>();
        corporate.setEmployees(managers);

        Manager corporateForManager = corporate.<Manager>gettingCorporate(manager3);

        for (Employee manager5 : corporate.getEmployees()) {
            manager5.getLastName();
        }

        StorageWorker loader = new StorageWorker("Nikolai", "Lalilalai");
        StorageWorker security = new StorageWorker("Petya", "Vasiliev");
        List<StorageWorker> storageWorkers = new ArrayList<>();
        storageWorkers.add(loader);
        storageWorkers.add(security);

        Vacation<StorageWorker> vacation = new Vacation<>();
        vacation.setStorageWorkers(storageWorkers);

        for (StorageWorker storageWorker5 : vacation.getStorageWorkers()) {
            storageWorker5.getLastName();
        }

        LOGGER.info(" Order can be completed " + order.getFinishDate());
        LOGGER.info(" Sum of the order " + sum);
        LOGGER.info(" Client size " + order.getClients().size());
        LOGGER.info(" Details " + wheel.getDetailName() + " " + mirror.getDetailName() + " " + mirror2.getDetailName());
        LOGGER.info(" Will the order be completed?  " + order.canOrderBeCompleted());

        try {
            AutoService.setStorageNumber(0);
        } catch (WrongStorageNumberException e) {
            e.printStackTrace();
            LOGGER.info(" Wrong Storage number");
        } finally {
            LOGGER.info(" Finally ");
        }

        String clien3 = null;
        if (clien3.equals(" Null Pointer Exception ")) {
        }

        try (OrderResource orderResource = new OrderResource()) {
            LOGGER.info(" Auto closed ");
        }

        for (Car car : cars) {
            car.getMaxSpeed();
            car.carryPassengers();
        }

        LOGGER.info(passengerCar);
        LOGGER.info(" The manager today is " + manager);
        LOGGER.info(" Storage worker today is " + storageWorker);
        LOGGER.info(" This is for RunTime exception " + client2.getFirstName() + client2.getLastName());
    }

}
