package be.nextlevelclinic.enums;

public enum Gender {
    MALE, FEMALE, UNKNOWN;

    public static Gender fromString(String genderString){
        switch(genderString.toLowerCase()){
            case "man", "m", "male" -> {
                return MALE;
            }
            case "vrouw", "v", "female"->{
                return FEMALE;
            }
            default -> {
                return UNKNOWN;
            }
        }
    }
}
