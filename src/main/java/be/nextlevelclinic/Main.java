package be.nextlevelclinic;

import be.nextlevelclinic.calculation.strategies.BMICalculation;
import be.nextlevelclinic.calculation.strategies.BMRCalculator;
import be.nextlevelclinic.enums.Gender;
import be.nextlevelclinic.model.UserData;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserData client = new UserData("male", 88, 1.85,31);
        client.setGender("m");
        System.out.println(BMRCalculator.calculate(Gender.fromString("Male"), 99, 185,27));

        BMRCalculator bmrCalculator = new BMRCalculator();
        System.out.println(bmrCalculator.calculate(client));
        System.out.println(client.getHeight());
        BMICalculation calculation = new BMICalculation();
        System.out.println(calculation.calculate(client));


//        ConsoleView view = new ConsoleView();
//        CustomerSession session = new CustomerSession();
//        CustomerController customerController =
//                new CustomerController(session,view);
//        customerController.handleUserCreation();
//        Customer customer = session.getCurrentCustomer();
//        BmiController bmiController = new BmiController(customer    );
//        System.out.println(customer.getAge());
//        System.out.println(customer.getBmi());
//        System.out.println(customer.getBmiClassification());
//
//        System.out.println("Doel: ");
//        customer.setGoal(scanner.nextLine());
//        Customer customer = new Customer("Marlon", 99,1.90,19);
//        customer.setGoal("behouden");
//        double bmi = CalculateBMI.calculateBMI(customer);
//        System.out.println(bmi);

//        SimpleCalorieIntakeCalculator calorieIntakeCalculator =
//                new SimpleCalorieIntakeCalculator(customer);
//        System.out.println(calorieIntakeCalculator.calculate());




    }
}
