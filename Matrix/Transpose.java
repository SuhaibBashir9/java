package Matrix;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        // Original 2x3 Matrix
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: "); 
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] original = new int[r][c];

        System.out.println("Enter " + (r * c) + " numbers for the matrix:");
        for (int i = 0; i < r; i++) {   
            for (int j = 0; j < c; j++) {
                original[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
       

        int[][] transpose = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = original[i][j];
            }
        }
      

        System.out.println("Transposed Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");    
    }
            System.out.println();
        }
    }
}
