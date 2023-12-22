package be.nextlevelclinic.model.customer;

/**
 * Represents a session for a customer.
 * This class holds the state of a customer during a session.
 */
public class CustomerSession {
    // The current customer in the session.
    private Customer currentCustomer;

    /**
     * Retrieves the current customer in the session.
     *
     * @return the current customer.
     */
    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    /**
     * Sets the current customer in the session.
     * This method is used to update or assign a new customer to the session.
     *
     * @param currentCustomer The customer to be set as the current customer.
     */
    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
}
