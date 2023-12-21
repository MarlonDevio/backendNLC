package be.nextlevelclinic.model;

/**
 * Represents a customer with various personal attributes such as weight, height, age, and name.
 * This class is designed to manage and validate customer data related to fitness applications.
 */
public class Customer {
    private double weight;
    private double height;
    private double sportFrequency;
    private double bmi;
    private String bmiClassification;
    private int age;
    private String name;


    /**
     * Constructor to create a Customer with just a name.
     *
     * @param name The name of the customer.
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Constructor to create a Customer with weight and height.
     *
     * @param weight The weight of the customer in kilograms. Expected to be in the range of 50kg to 200kg.
     * @param height The height of the customer in meters. Expected to be in the range of 1.40m to 2.50m.
     */
    public Customer(double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }

    /**
     * Constructor to create a Customer with name, weight, height, and age.
     *
     * @param name   The name of the customer.
     * @param weight The weight of the customer in kilograms. Expected to be in the range of 50kg to 200kg.
     * @param height The height of the customer in meters. Expected to be in the range of 1.40m to 2.50m.
     * @param age    The age of the customer in years.
     */
    public Customer(String name, double weight, double height, int age) {
        this(weight, height);
        this.name = name;
        setAge(age);
    }

    /**
     * Gets the weight of the customer.
     *
     * @return The weight in kilograms.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the customer.
     *
     * @param weight The weight in kilograms. Must be between 50kg and 200kg.
     * @throws IllegalArgumentException if the weight is outside the specified range.
     */
    public void setWeight(double weight) {
        if (weight <= 50 || weight >= 200)
            throw new IllegalArgumentException("Gewicht moet tussen 50kg en 200kg liggen.");
        this.weight = weight;
    }

    /**
     * Gets the height of the customer.
     *
     * @return The height in meters.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the customer.
     *
     * @param height The height in meters. Must be between 1.40m and 2.50m.
     * @throws IllegalArgumentException if the height is outside the specified range.
     */
    public void setHeight(double height) {
        if (height < 1.40 || height > 2.50)
            throw new IllegalArgumentException("Lengte moet tussen 1.40m en 2.50m liggen.");
        this.height = height;
    }

    /**
     * Gets the sport frequency of the customer.
     *
     * @return The frequency of sports activities.
     */
    public double getSportFrequency() {
        return sportFrequency;
    }

    /**
     * Sets the sport frequency of the customer.
     *
     * @param sportFrequency The frequency of sports activities.
     */
    public void setSportFrequency(double sportFrequency) {
        this.sportFrequency = sportFrequency;
    }

    /**
     * Gets the age of the customer.
     *
     * @return The age in years.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the customer.
     *
     * @param age The age in years.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the name of the customer.
     *
     * @return The name of the customer.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the customer.
     *
     * @param name The name of the customer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the BMI (Body Mass Index) of the customer.
     *
     * @param bmi The Body Mass Index.
     */
    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    /**
     * Gets the BMI (Body Mass Index) of the customer.
     *
     * @return The Body Mass Index.
     */
    public double getBmi() {
        return this.bmi;
    }

    public String getBmiClassification() {
        return bmiClassification;
    }

    public void setBmiClassification(String bmiClassification) {
        this.bmiClassification = bmiClassification;
    }
}
