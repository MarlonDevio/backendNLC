package be.nextlevelclinic.utils;

import be.nextlevelclinic.model.Customer;

public class CalculateBMI {
    public static double calculateBMI(Customer customer) {
        double weight = customer.getWeight();
        double height = customer.getHeight();
        return weight / (height * height);
    }
}
