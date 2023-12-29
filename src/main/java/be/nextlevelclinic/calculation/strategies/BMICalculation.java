package be.nextlevelclinic.calculation.strategies;

import be.nextlevelclinic.interfaces.CalculationStrategy;
import be.nextlevelclinic.helpers.Round;
import be.nextlevelclinic.model.UserData;

public class BMICalculation implements CalculationStrategy {
    @Override
    public double calculate(UserData userData) {
        return calculateBMI(userData.getWeight(), userData.getHeight());
    }

    public static double calculateBMI(double weight, double height){
        double heightInM = height/100;
        return Round.round(weight/(heightInM * heightInM), 2);
    }
}
