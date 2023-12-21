package be.nextlevelclinic.model;

public class CustomerFactory {
    public static Customer createCustomer(String name){
        return new Customer(name);
    }

    public static Customer createCustomer(double weight, double height){
        return new Customer(weight, height);
    }

    public static Customer createCustomer(String name, double weight,
                                          double height, int age){
        return new Customer(name, weight, height, age);
    }
}
