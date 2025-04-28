import java.util.Scanner;

// Custom exception class
class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class Gradevalidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's grade (A-F): ");
        String input = sc.nextLine().toUpperCase();

        try {
            checkGrade(input);
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        }
    }

    // Method to check if grade is valid
    public static void checkGrade(String grade) throws InvalidGradeException {
        if (grade.length() != 1 || grade.charAt(0) < 'A' || grade.charAt(0) > 'F') {
            throw new InvalidGradeException("Grade must be a single character between A and F.");
        }
    }
}
