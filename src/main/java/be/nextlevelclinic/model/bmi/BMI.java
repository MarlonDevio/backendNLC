package be.nextlevelclinic.model.bmi;

import be.nextlevelclinic.model.customer.Customer;
import be.nextlevelclinic.utils.bmi.CalculateBMI;

public class BMI {
    public static double calculateBMI(Customer customer) {
        return CalculateBMI.calculateBMI(customer);
    }

}
