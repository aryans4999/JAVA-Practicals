import java.util.Scanner;

public class exception_handling {
    public static void main(String[] Args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:   ");
        a = sc.nextDouble();
        System.out.print("Enter the second number:  ");
        b = sc.nextDouble();
        sc.close();
        try {
            double c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}