import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = a.nextInt();
        int n = number;
        int sum = 0;
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }
         temp = n;

         while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (n==sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        a.close();    }

    
}
