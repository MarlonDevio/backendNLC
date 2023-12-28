import be.nextlevelclinic.calculator.Calculator;
import be.nextlevelclinic.customer.Customer;

public class CustomerTestDrive {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1.85, 99);
        Customer customer2 = new Customer();
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(Customer.getCustomers());
        System.out.println(Customer.getCustomers());

    }
}
