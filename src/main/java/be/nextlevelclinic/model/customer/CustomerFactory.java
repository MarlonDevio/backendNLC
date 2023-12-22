package be.nextlevelclinic.model.customer;

/**
 * Factory class for creating Customer objects.
 * This class implements the Factory design pattern to provide a way to create Customer objects with different sets of initial data.
 */
public class CustomerFactory {

    /**
     * Creates a Customer object with only the name provided.
     *
     * @param name The name of the Customer.
     * @return A new Customer object with the given name.
     */
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    /**
     * Creates a Customer object with weight and height.
     *
     * @param weight The weight of the Customer.
     * @param height The height of the Customer.
     * @return A new Customer object with the specified weight and height.
     */
    public static Customer createCustomer(double weight, double height) {
        return new Customer(weight, height);
    }

    /**
     * Creates a Customer object with name, weight, height, and age.
     *
     * @param name The name of the Customer.
     * @param weight The weight of the Customer.
     * @param height The height of the Customer.
     * @param age The age of the Customer.
     * @return A new Customer object with the specified name, weight, height, and age.
     */
    public static Customer createCustomer(String name, double weight, double height, int age) {
        return new Customer(name, weight, height, age);
    }
}
