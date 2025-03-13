import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int pa = a.nextInt();
        int b = pa;
        int rev = 0;
        while(pa > 0){
            int digit = pa % 10;
            rev = rev * 10 + digit;
            pa /= 10;

        }
        
        if (b == rev) {
            System.out.println(b + " is a palindrome.");
        } else {
            System.out.println(b + " is not a palindrome.");
        }
        a.close();
    }


    
}
