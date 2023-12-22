package be.nextlevelclinic.view;

import be.nextlevelclinic.utils.input.InputProvider;

/**
 * Console view class for user interaction.
 * This class handles input and output operations in the console.
 */
public class ConsoleView {
    // An instance of InputProvider to handle user input.
    private InputProvider inputProvider = new InputProvider();

    /**
     * Prompts the user for a double value.
     *
     * @param prompt The message to be displayed as a prompt.
     * @return The double value input by the user.
     */
    public double getDoubleInput(String prompt) {
        return inputProvider.getDoubleInput(prompt);
    }

    /**
     * Prompts the user for a string.
     *
     * @param prompt The message to be displayed as a prompt.
     * @return The string input by the user.
     */
    public String getStringInput(String prompt) {
        return inputProvider.getStringInput(prompt);
    }

    /**
     * Prompts the user for an integer value.
     *
     * @param prompt The message to be displayed as a prompt.
     * @return The integer value input by the user.
     */
    public int getIntegerInput(String prompt) {
        return inputProvider.getIntInput(prompt);
    }

    /**
     * Displays a given message to the console.
     *
     * @param message The message to be displayed.
     */
    public void displayResult(String message) {
        System.out.println(message);
    }
}
