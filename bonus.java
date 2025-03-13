import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your position(Manager/Developer/Intern): ");
        String pos = a.nextLine();
        System.out.println("Enter your experience: ");
        int exp=a.nextInt();
        double bonus=0;
        double salary=0;
        switch (pos) {
            case "Manager":
                    salary=50000;
                break;
            case "Developer":
                    salary=30000;
                break;
            case "Intern":
                    salary=15000;
                break;
            default:
                System.out.println("Enter correct position");
                break;
        }
            if(exp>5){
                bonus=(salary*(0.2));
                salary+=bonus;
            }
            else if(exp>=3&&exp<=5){
                bonus=(salary*(0.10));
                salary+=bonus;
            }
            else{
                bonus=0;
                salary+=bonus;

            }    
        
        System.out.println("According to your position and experience your new salary is: ");
        System.out.println(salary);
        a.close();
        }
    }
    

