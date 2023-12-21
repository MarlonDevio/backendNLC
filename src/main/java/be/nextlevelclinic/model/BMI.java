package be.nextlevelclinic.model;

import be.nextlevelclinic.utils.CalculateBMI;

public class BMI {

    public static double calculateBMI(Customer customer) {
        return CalculateBMI.calculateBMI(customer);
    }
}
