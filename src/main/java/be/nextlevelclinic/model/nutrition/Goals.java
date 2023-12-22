package be.nextlevelclinic.model.nutrition;

/**
 * Enumeration representing various health and fitness goals.
 * Each goal is associated with a specific caloric multiplier value
 * that can be used to calculate dietary needs based on the goal.
 */
public enum Goals {
    // Enum constants
    LOSE_WEIGHT("afvallen", 13),
    STAY_ON_WEIGHT("behouden", 15),
    GAIN_WEIGHT("aankomen", 19);

    // Fields
    private final String description;   // Description of the goal
    private final int calMultiplier;    // Caloric multiplier for the goal

    /**
     * Constructor for the Goals enumeration.
     *
     * @param description   Description of the goal.
     * @param calMultiplier Caloric multiplier associated with the goal.
     */
    Goals(String description, int calMultiplier) {
        this.description = description;
        this.calMultiplier = calMultiplier;
    }

    /**
     * Returns the caloric multiplier associated with the goal.
     *
     * @return The caloric multiplier.
     */
    private int getCalMultiplier() {
        return calMultiplier;
    }

    /**
     * Returns the description of the goal.
     *
     * @return The description of the goal.
     */
    private String getDescription() {
        return description;
    }

    /**
     * Static method to get the caloric multiplier based on a goal description.
     * This method is useful when the goal is provided as a string.
     *
     * @param goal The goal description.
     * @return The caloric multiplier associated with the provided goal.
     */
    private static int calMultiplier(String goal) {
        int multiplier = 0;
        switch (goal.toLowerCase()) {
            case "afvallen" -> multiplier = LOSE_WEIGHT.getCalMultiplier();
            case "behouden" -> multiplier = STAY_ON_WEIGHT.getCalMultiplier();
            case "aankomen" -> multiplier = GAIN_WEIGHT.getCalMultiplier();
        }
        return multiplier;
    }

    /**
     * Public static method to get the caloric multiplier based on a goal string.
     * It calls the private static method calMultiplier.
     *
     * @param goal The string representation of the goal.
     * @return The caloric multiplier for the specified goal.
     */
    public static int getCalMultiplier(String goal){
        return calMultiplier(goal);
    }
}
