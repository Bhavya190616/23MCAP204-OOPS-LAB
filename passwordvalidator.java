 import java.util.Scanner;

public class passwordvalidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (Exception e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }

    // Method to validate the password
    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*\\d.*")) {  // \\d checks for digit
            throw new Exception("Password must contain at least one number.");
        }

        if (!password.matches(".*[\\{\\$#&\\}].*")) {  // special chars within [ ] and escaped
            throw new Exception("Password must contain at least one special character {$#&}.");
        }
    }
}
 