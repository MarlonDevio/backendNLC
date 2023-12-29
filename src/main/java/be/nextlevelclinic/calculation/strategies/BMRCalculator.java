package be.nextlevelclinic.calculation.strategies;

import be.nextlevelclinic.enums.Gender;
import be.nextlevelclinic.helpers.Round;
import be.nextlevelclinic.interfaces.CalculationStrategy;
import be.nextlevelclinic.model.UserData;

/**
 * Calculates total daily calorie intake.
 */
public class BMRCalculator implements CalculationStrategy {

//    public double calculate(UserData userData) {
//        return calculate(userData.getGender(), userData.getWeight(),
//                userData.getHeight(), userData.getAge());
//
//    }
    @Override
    public double calculate(UserData userData){
        double genderVariable = userData.getGender() == Gender.MALE ? 5: -161;
        return Round.round((10 * userData.getWeight()) + (6.25 * userData.getHeight()) - (5* userData.getAge()) + genderVariable, 2);
    }


    public static double calculate(Gender gender, double weightInKg,
                                   double heightInCm, double age) {
        switch (gender) {
            case MALE -> {
                return 66.5 + (13.75 * weightInKg) + (5.003 * heightInCm) - (6.75 * age);
            }
            case FEMALE -> {
                return 655.1 + (9.563 * weightInKg) + (1.850 * heightInCm) - (4.676 * age);
            }
            default -> {
                return 0;
            }
        }
    }
}
