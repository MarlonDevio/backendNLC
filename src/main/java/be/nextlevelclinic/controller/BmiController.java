package be.nextlevelclinic.controller;

import be.nextlevelclinic.model.bmi.BMI;
import be.nextlevelclinic.model.bmi.BmiClassification;
import be.nextlevelclinic.model.customer.Customer;

public class BmiController {

    private Customer customer;

    public BmiController(Customer customer){
        double bmi = BMI.calculateBMI(customer);
        String classification = BmiClassification.getClassification(bmi);
        customer.setBmi(bmi);
        customer.setBmiClassification(classification);
    }


}
