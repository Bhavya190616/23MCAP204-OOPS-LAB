import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your TotalMarks(out of 500): ");
        double total=a.nextInt();
        String grade;
        double per=0;
        per=Math.round((total/500)*100);
        if(per>=90){
            grade="A";
        }
        else if(per>=80 && per<=89){
            grade="B";
        }
        else if(per>=70 && per<=79){
            grade="C";
        }
        else if(per>=60 && per<=69){
            grade="D";
        }
        else{
            grade="F";
        }

        switch (grade) {
            case "A":
                System.out.println(grade);
                System.out.println("Excellent work!");
                break;
            case "B":
                System.out.println(grade);
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println(grade);
                System.out.println("You can do better");
                break;
            case "D":
                System.out.println(grade);
                System.out.println("Work harder");
                break;
            case "F":
                System.out.println(grade);
                System.out.println("Failed. Try again");
                break;   
            default:
                break;
        }
        a.close();
        
    }
    
}
