import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
    
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = a.nextInt();
        int b = 0, c = 1;

        System.out.print("Fibonacci Sequence up to " + n + ": ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(b + " ");
            int d = b + c;
            b = c;
            c = d;
        }
        a.close();
        
}
}

