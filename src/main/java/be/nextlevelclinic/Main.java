package be.nextlevelclinic;

import be.nextlevelclinic.controller.BmiController;
import be.nextlevelclinic.controller.CustomerController;
import be.nextlevelclinic.model.BMI;
import be.nextlevelclinic.model.Customer;
import be.nextlevelclinic.model.CustomerSession;
import be.nextlevelclinic.utils.InputProvider;
import be.nextlevelclinic.view.ConsoleView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        CustomerSession session = new CustomerSession();
        CustomerController customerController =
                new CustomerController(session,view);
        customerController.handleUserCreation();
        Customer customer = session.getCurrentCustomer();
        BmiController bmiController = new BmiController(customer    );
        System.out.println(customer.getAge());
        System.out.println(customer.getBmi());
        System.out.println(customer.getBmiClassification());




    }
}
