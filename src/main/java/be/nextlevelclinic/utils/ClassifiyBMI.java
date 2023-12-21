package be.nextlevelclinic.utils;

import be.nextlevelclinic.model.BmiClassification;

public class ClassifiyBMI {
    BmiClassification classification;

    public ClassifiyBMI(BmiClassification classification){
        this.classification = classification;
    }

    public String classify(){
        switch (classification){
            case UNDERWEIGHT -> {
                return "Ondergewicht";
            }
            case NORMAL -> {
                return "Normaal" ;
            }
            case OVERWEIGHT -> {
                return "Overgewicht";
            }
            case OBESE -> {
                return "Obesitas";
            }
        }
        return null;
    }
}
