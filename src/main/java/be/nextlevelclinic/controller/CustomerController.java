package be.nextlevelclinic.controller;

import be.nextlevelclinic.model.customer.Customer;
import be.nextlevelclinic.model.customer.CustomerFactory;
import be.nextlevelclinic.model.customer.CustomerSession;
import be.nextlevelclinic.view.ConsoleView;

/**
 * Controller class for managing customer interactions.
 */
public class CustomerController {
    // Dependencies are injected here. Dependency Injection helps in making the code more modular and testable.
    private CustomerSession currentCustomer;
    private ConsoleView view;

    /**
     * Constructor for CustomerController.
     *
     * @param currentCustomer The current customer session.
     * @param view The console view used for interaction with the user.
     */
    public CustomerController(CustomerSession currentCustomer, ConsoleView view) {
        this.currentCustomer = currentCustomer;
        this.view = view;
    }

    /**
     * Handles the creation of a new user.
     * It prompts the user for the necessary information, creates a new customer, and sets it as the current customer.
     */
    public void handleUserCreation() {
        // Get user input for each customer attribute.
        String name = view.getStringInput("Naam: ");
        double weight = view.getDoubleInput("Gewicht: ");
        double height = view.getDoubleInput("Lengte: ");
        int age = view.getIntegerInput("Leeftijd: ");

        // Use the factory pattern to create a new customer object.
        Customer newCustomer = CustomerFactory.createCustomer(name, weight, height, age);

        // Set the newly created customer as the current customer in the session.
        currentCustomer.setCurrentCustomer(newCustomer);
    }
}
