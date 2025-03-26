import java.util.Scanner;


public class stringpal {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String str = a.nextLine();

        
        str = str.toLowerCase();
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }

       if(reverse.equals(str)){
        System.out.println("Entered string is pallindrome");
       }

       else{
        System.out.println("Entered string is not pallindrome");
       }
        
        a.close();  
    }
}
