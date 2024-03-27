 //Write a java program using throws keyword to handle custom exception?

 import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Main {
    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("You are not eligible to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            validateAge(age);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}