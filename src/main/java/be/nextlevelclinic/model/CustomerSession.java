package be.nextlevelclinic.model;

public class CustomerSession {
    private Customer currentCustomer;

//    public CustomerSession(Customer currentCustomer){
//        this.currentCustomer = currentCustomer;
//    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }
}
