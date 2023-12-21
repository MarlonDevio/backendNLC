package be.nextlevelclinic.utils;

@FunctionalInterface
public interface ValidationRule {
    void validate(double value) throws IllegalArgumentException;
}
