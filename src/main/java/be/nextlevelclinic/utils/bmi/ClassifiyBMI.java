package be.nextlevelclinic.utils.bmi;

import be.nextlevelclinic.model.bmi.BmiClassification;

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
