import java.util.Scanner;

public class stringpal {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = a.nextLine();

        
        str = str.toLowerCase();

       

       
        boolean pal = true;
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                pal = false;
                break;
            }
        }

       
        if (pal) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        a.close();  
    }
}
