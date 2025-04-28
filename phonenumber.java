import java.util.Scanner;

public class phonenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNumber = sc.nextLine();

        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is valid.");
        } catch (Exception e) {
            System.out.println("Invalid phone number: " + e.getMessage());
        }
    }

    // Method to validate phone number
    public static void validatePhoneNumber(String phone) throws Exception {
        if (!phone.matches("\\d{10}")) {
            throw new Exception("Phone number must contain exactly 10 digits.");
        }
    }
}

