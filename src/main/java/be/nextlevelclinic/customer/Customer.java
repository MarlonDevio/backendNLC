package be.nextlevelclinic.customer;

import be.nextlevelclinic.helpers.Round;

public class Customer {
    private static int customers;
    private String name;
    private String gender;
    private int age;
    private double length;
    private double weight;
    private double bmi;

    {
        customers++;
    }

    public Customer(){};

    public Customer(double length, double weight){
        this("customer"+customers,null,0, length, weight);
    }

    public Customer(String name,String gender, int age, double length,
                    double weight){
       this.name=name;
       this.gender=gender;
       this.age=age;
       this.length=length;
       this.weight=weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi){
        this.bmi = Round.round(bmi, 2);
    }

    public static int getCustomers(){
        return customers;
    }

    @Override
    public String toString() {
        return this.name+" {" +
                "length=" + length +
                ", weight=" + weight +
                ", bmi=" + bmi +
                '}';
    }
}
