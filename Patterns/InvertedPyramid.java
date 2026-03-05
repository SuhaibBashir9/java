package Patterns;
import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int rows = sc.nextInt();
        sc.close();

        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = (2 * i - 1); j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
