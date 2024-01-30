import java.util.Scanner;

class Student {
    // Attributes
    private int studentID;
    private String studentName;
    private double marksSubject1;
    private double marksSubject2;
    private double marksSubject3;

    // Member function to set data
    public void setData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student ID:");
        studentID = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Student Name:");
        studentName = scanner.nextLine();

        System.out.println("Enter Marks for Subject 1:");
        marksSubject1 = scanner.nextDouble();

        System.out.println("Enter Marks for Subject 2:");
        marksSubject2 = scanner.nextDouble();

        System.out.println("Enter Marks for Subject 3:");
        marksSubject3 = scanner.nextDouble();
    }

    // Member function to display data and calculate average marks
    public void displayData() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks for Subject 1: " + marksSubject1);
        System.out.println("Marks for Subject 2: " + marksSubject2);
        System.out.println("Marks for Subject 3: " + marksSubject3);

        // Calculate and display the average marks
        double averageMarks = (marksSubject1 + marksSubject2 + marksSubject3) / 3.0;
        System.out.println("Average Marks: " + averageMarks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student1 = new Student();

        // Call the setData() method to input data
        student1.setData();

        // Call the displayData() method to display data and calculate average marks
        student1.displayData();
    }
}
