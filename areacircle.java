import java.util.Scanner;
public class areacircle{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        int rad= a.nextInt();
        double area;
        area = (3.14*rad*rad);
        System.out.println("The area is :");
        System.out.println(area);
        a.close();
    }
}