import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

       
        System.out.print("Enter a line of text: ");
        String text = a.nextLine();

       
        int vowel = 0;
        int consonant = 0;

        
        text = text.toLowerCase();

        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            
            else if ((ch >= 'a' && ch <= 'z')) {  
                consonant++;
            }
        }

       
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

        a.close();  
    }
}
