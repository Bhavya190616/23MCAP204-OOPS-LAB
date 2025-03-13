import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        
        System.out.print("Enter the number of rows and columns: ");
        int n = a.nextInt();  
        int[][] matrix = new int[n][n];

       
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = a.nextInt();
            }
        }

       
        boolean isSymmetric = true;  

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;  
                    break;  
                }
            }
            if (!isSymmetric) {
                break; 
            }
        }

       
        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }

        a.close();  
    }
}
