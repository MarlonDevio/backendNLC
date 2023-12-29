package be.nextlevelclinic.model;

import be.nextlevelclinic.calculation.strategies.BMICalculation;
import be.nextlevelclinic.calculation.strategies.BMRCalculator;
import be.nextlevelclinic.enums.BodyMovement;
import be.nextlevelclinic.enums.Gender;
import be.nextlevelclinic.enums.GoalType;

public class UserData {
    private Gender gender;
    private BodyMovement bodyMovement;
    private GoalType goalType;
    private double weight;
    private double height;
    private double age;
    private double bmr;
    private double bmi;

    public UserData(String gender, double weight, double height, double age) {
        setGender(gender);
        this.weight = weight;
        setHeight(height);
        this.age = age;
    }

    public GoalType getGoalType() {
        return goalType;
    }

    public void setGoalType(String goalType) {
        this.goalType = GoalType.fromString(goalType);
    }

    public BodyMovement getBodyMovement() {
        return bodyMovement;
    }

    public void setBodyMovement(String bodyMovement) {
        this.bodyMovement = BodyMovement.fromString(bodyMovement);
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return this.age;
    }


    public Gender getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = Gender.fromString(gender);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 2.5) {
            this.height = height * 100;
            return;
        }
        this.height = height;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public double getBmr() {
        return this.bmr;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }
}
