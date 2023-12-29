package be.nextlevelclinic.interfaces;

import be.nextlevelclinic.model.UserData;

public interface CalculationStrategy {
    double calculate(UserData userData);
}
