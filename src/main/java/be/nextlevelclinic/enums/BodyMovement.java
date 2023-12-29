package be.nextlevelclinic.enums;

public enum BodyMovement {
    UNKNOWN, LOW, MODERATE, VERY_ACTIVE;

    public static BodyMovement fromString(String bodyMovement){
        switch (bodyMovement.toLowerCase()){
            case "weinig", "low" -> {
                return LOW;
            }
            case "gemiddeld", "normaal", "moderate" -> {
                return MODERATE;
            }
            case "veel", "very active", "active", "alot" -> {
                return VERY_ACTIVE;
            }
            default -> {
                return UNKNOWN;
            }
        }
    }
}
