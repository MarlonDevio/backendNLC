package be.nextlevelclinic.utils.bmi;

import be.nextlevelclinic.model.customer.Customer;

// TODO Check what to do with the calculateBMI, put it inside it's own class
//  or as helper
public class CalculateBMI {
    public static double calculateBMI(Customer customer) {
        return calculateBMI(customer.getWeight(), customer.getHeight());
    }
    public static double calculateBMI(double weight, double height){
        return weight/(height*height);
    }
}
