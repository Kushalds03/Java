import java.util.Scanner;

public class Array2D { 
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];
        int n = 2, m = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // It's good practice to close the scanner
    }
}
