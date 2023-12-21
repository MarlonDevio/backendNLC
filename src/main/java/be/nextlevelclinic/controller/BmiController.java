package be.nextlevelclinic.controller;

import be.nextlevelclinic.model.BMI;
import be.nextlevelclinic.model.BmiClassification;
import be.nextlevelclinic.model.Customer;
import be.nextlevelclinic.view.ConsoleView;

public class BmiController {

    private Customer customer;

    public BmiController(Customer customer){
        double bmi = BMI.calculateBMI(customer);
        String classification = BmiClassification.getClassification(bmi);
        customer.setBmi(bmi);
        customer.setBmiClassification(classification);
    }


}
