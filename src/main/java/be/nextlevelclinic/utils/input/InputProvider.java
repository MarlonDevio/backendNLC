package be.nextlevelclinic.utils.input;

import java.util.Scanner;

public class InputProvider {
    // Scanner object for reading user input from the console.
    private Scanner scanner = new Scanner(System.in);

    /**
     * Retrieves a line of text from the user.
     * This private method is utilized by other public methods in this class.
     *
     * @param message The prompt displayed to the user.
     * @return The entered text as a String.
     */
    private String getInput(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    /**
     * Obtains a String input from the user.
     * This method also validates that the input is at least 2 characters long.
     * If not, it prompts the user again.
     *
     * @param message The prompt displayed to the user.
     * @return A valid String input.
     */
    public String getStringInput(String message) {
        String input = getInput(message);
        if (input.length() < 2) {
            System.out.println("Naam moet minstens 2 letters hebben");
            return getStringInput(message);
        }
        return input;
    }

    /**
     * Retrieves a double value from the user input.
     * If the input is not a valid double, it informs the user and prompts again.
     *
     * @param message The prompt displayed to the user.
     * @return A valid double value.
     */
    public double getDoubleInput(String message) {
        String input = getInput(message);
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Geen geldig getal.");
            return getDoubleInput(message);
        }
    }

    public int getIntInput(String message){
        String input = getInput(message);
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException e){
            System.out.println("Geen geldige getal");
            return getIntInput(message);
        }
    }
}
