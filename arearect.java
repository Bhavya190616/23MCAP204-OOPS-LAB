import java.util.Scanner;

public class arearect {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter breadth: ");
        int bre = b.nextInt();
        double area;
        double perimeter;
        area = len * bre;
        perimeter = 2*(len + bre);
        System.err.println("The area is: ");
        System.out.println(area);
        System.out.println("The perimeter is: ");
        System.out.println(perimeter);
        a.close();
        b.close();

    }
    
}
