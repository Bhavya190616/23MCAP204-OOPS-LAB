 import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Enter marks for Math: ");
        int maths = a.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = a.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = a.nextInt();

        
        int total = maths + physics + chemistry;
        
        
        int totalMarks = maths + physics;

        
        boolean Allsub = total >= 150;
        boolean mathsphys = totalMarks >= 100;

       
        if (Allsub) {
            System.out.println("The student is eligible on all subjects");
        } else {
            System.out.println("The student is not eligible");
        }

        if (mathsphys) {
            System.out.println("The student is eligible based on  Math and Physics.");
        } else {
            System.out.println("The student is not eligible based on  Math and Physics.");
        }

       a.close();  
    }
}
 
