package be.nextlevelclinic.utils;

public class ValidationHelper {
    public static void validate(double value, ValidationRule rule,
                                String errorMessage){
        try {
            rule.validate(value);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
