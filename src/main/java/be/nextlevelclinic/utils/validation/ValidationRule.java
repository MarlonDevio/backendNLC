package be.nextlevelclinic.utils.validation;

@FunctionalInterface
public interface ValidationRule {
    void validate(Object value) throws IllegalArgumentException;
}
