import java.util.Scanner;

public class searchstring {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String inputString = a.nextLine();
        
        System.out.print("Enter the pattern to search for: ");
        String pattern = a.nextLine();
        
        System.out.print("Enter the string to replace with: ");
        String str = a.nextLine();

        
        String newstring = inputString.replaceAll(pattern, str);

       
        System.out.println("The new String is : ");
        System.out.println(newstring);

        a.close();
    }
}
