import java.util.Scanner;

// Define a class for adding two numbers
class Adder {
    private double number1;
    private double number2;

    // Constructor to initialize the numbers
    public Adder(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }

    // Method to perform the addition
    public double add() {
        return number1 + number2;
    }
}

public class AddTwoNumbersByClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for two numbers
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        // Create an object of the Adder class and pass the numbers to the constructor
        Adder adder = new Adder(num1, num2);

        // Call the add method to get the result
        double sum = adder.add();

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
