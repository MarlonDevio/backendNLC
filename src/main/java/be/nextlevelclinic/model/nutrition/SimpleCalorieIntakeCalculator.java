package be.nextlevelclinic.model.nutrition;

import be.nextlevelclinic.model.customer.Customer;


public class SimpleCalorieIntakeCalculator {
   private double weight;
   private String goal;


   public SimpleCalorieIntakeCalculator(String goal, double weight) {
      this.goal = goal;
      this.weight = weight;
   }

   public SimpleCalorieIntakeCalculator(Customer customer) {
      this.weight = customer.getWeight();
      this.goal = customer.getGoal();
   }

   public double calculate() {
      int multiplier = Goals.getCalMultiplier(this.goal);
      return (this.weight / 0.453) * multiplier;
   }
}
