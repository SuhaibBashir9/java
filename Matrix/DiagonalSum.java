package Matrix;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter matrix size n x n : ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                
              
                }

            }
            sc.close();

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
        }

        System.out.println("Diagonal Sum: " + sum);
    }
}
