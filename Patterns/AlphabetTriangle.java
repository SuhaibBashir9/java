package Patterns;
import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        traingle();
    }

     public static void traingle(){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the number of Rows: ");
    int rows = sc.nextInt();
    sc.close();
    int ch = 'A';

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j <= i; j++ ) {
            // searched how to print alphabet values.
            System.out.print((char)ch + " ");
            ch++;
        }

    System.out.println();

    }

}
}
