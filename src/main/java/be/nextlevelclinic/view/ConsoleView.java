package be.nextlevelclinic.view;

import be.nextlevelclinic.utils.InputProvider;

public class ConsoleView {
private InputProvider inputProvider = new InputProvider();

public double getDoubleInput(String prompt){
    return inputProvider.getDoubleInput(prompt);
}

public String getStringInput(String prompt){
    return inputProvider.getStringInput(prompt);
}

public int getIntegerInput(String prompt        ){
    return inputProvider.getIntInput(prompt);
}

public void displayResult(String message){
    System.out.println(message);
}
}
