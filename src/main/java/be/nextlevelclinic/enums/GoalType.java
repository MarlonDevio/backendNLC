package be.nextlevelclinic.enums;

public enum GoalType {
    UNKNOWN, LOSE, MAINTAIN, GAIN;

    public static GoalType fromString(String goal) {
        switch (goal.toLowerCase()) {
            case "vetverlies", "afvallen", "vet verliezen", "lose weight" -> {
                return LOSE;
            }
            case "behouden", "maintain", "gewicht behouden" -> {
                return MAINTAIN;
            }
            case "gain", "aankomen", "bijkomen", "gain weight" -> {
                return GAIN;
            }
            default -> {
                return UNKNOWN;
            }
        }
    }
}
