package Patterns;

import java.util.Scanner;

public class HollowSquare{
    public static void main(String[] args) {
        
        printSquare();
    }

    public static void printSquare(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int rows = sc.nextInt();
        sc.close();
        int i ;
        int j ;

        for (i = 0; i < rows; i++) {
            for ( j = 0; j < rows; j++) {
                // if (i == 0 ) {
                //     System.out.print("* ");
                // } else if (i == rows - 1 ) {
                //     System.out.print("* ");
                // } else if (j == 0) {
                //     System.out.print("* ");
                // } else if (  j == rows - 1) {
                //     System.out.print("* ");   
                // } else {
                //     System.out.print("  ");
                // }

                if (i == 0 || i == rows - 1 || j == 0 || j == rows - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}