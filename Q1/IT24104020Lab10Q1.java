import java.util.Scanner;

public class IT24104020Lab10Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // Assertion for valid mark range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine the grade
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Assertion to verify the grade
        assert (grade == 'A' && mark >= 75 || 
                grade == 'B' && mark >= 60 && mark < 75 || 
                grade == 'C' && mark >= 50 && mark < 60 || 
                grade == 'D' && mark >= 40 && mark < 50 || 
                grade == 'F' && mark < 40) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}
