package be.nextlevelclinic.model;

/**
 * Enum representing BMI classifications.
 */
public enum BmiClassification {
    UNDERWEIGHT(Double.MIN_VALUE, 18.5),
    NORMAL(18.5, 25.0),
    OVERWEIGHT(25, 30),
    OBESE(30, Double.MAX_VALUE);

    private final double min;
    private final double max;

    /**
     * Constructs a new BmiClassification with specified min and max values.
     *
     * @param min The minimum BMI value for this classification.
     * @param max The maximum BMI value for this classification.
     */
    BmiClassification(double min, double max) {
        this.min = min;
        this.max = max;
    }

    /**
     * Gets the minimum BMI value.
     *
     * @return The minimum BMI value.
     */
    private double getMin() {
        return min;
    }

    /**
     * Gets the maximum BMI value.
     *
     * @return The maximum BMI value.
     */
    private double getMax() {
        return max;
    }

    /**
     * Classifies the given BMI value.
     *
     * @param bmi The BMI to classify.
     * @return The BmiClassification corresponding to the given BMI.
     * @throws IllegalArgumentException If the BMI value is invalid.
     */
    private static BmiClassification classify(double bmi) {
        for (BmiClassification classification : BmiClassification.values()) {
            if (bmi >= classification.getMin() && bmi < classification.getMax()) {
                return classification;
            }
        }
        throw new IllegalArgumentException("Invalid BMI: " + bmi);
    }

    /**
     * Assigns a human-readable category to the given BMI classification.
     *
     * @param classification The BMI classification to describe.
     * @return A string representation of the classification.
     */
    private static String assignClassification(BmiClassification classification){
        String category = null;
        switch (classification) {
            case OBESE -> category = "Obesitas";
            case OVERWEIGHT -> category = "Overgewicht";
            case NORMAL -> category = "Normaal";
            case UNDERWEIGHT -> category = "Ondergewicht";
        }
        return category;
    }

    /**
     * Gets the classification category for a given BMI.
     *
     * @param bmi The BMI to classify.
     * @return A string representing the classification of the BMI.
     */
    public static String getClassification(double bmi) {
        BmiClassification classification = classify(bmi);
        return assignClassification(classification);
    }
}
