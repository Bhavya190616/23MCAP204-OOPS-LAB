import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int rows = a.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = a.nextInt();

        int[][] matrix = new int[rows][cols];

       
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = a.nextInt();
            }
        }

        
        System.out.println("\nSum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }

       a.close();
    }
}
