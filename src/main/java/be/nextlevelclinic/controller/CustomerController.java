package be.nextlevelclinic.controller;

import be.nextlevelclinic.model.Customer;
import be.nextlevelclinic.model.CustomerFactory;
import be.nextlevelclinic.model.CustomerSession;
import be.nextlevelclinic.view.ConsoleView;

public class CustomerController {
    // Dependency injection
    private CustomerSession currentCustomer;
    private ConsoleView view;

    public CustomerController(CustomerSession currentCustomer,
                               ConsoleView view){
        this.currentCustomer = currentCustomer;
        this.view =view;
    }

    public void handleUserCreation(){
        String name = view.getStringInput("Naam: ");
        double weight = view.getDoubleInput("Gewicht: ");
        double height = view.getDoubleInput("Lengte: ");
        int age = view.getIntegerInput("Leeftijd: ");

        Customer newCustomer = CustomerFactory.createCustomer(name, weight,
                height, age);

        currentCustomer.setCurrentCustomer(newCustomer);
    }


}
