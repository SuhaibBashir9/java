package Patterns;
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        traingle();
    }

    public static void traingle(){
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the number of Rows: ");
    int rows = sc.nextInt();
    sc.close();
    int num = 1;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j <= i; j++ ) {
            System.out.print(num + " ");
            num++;
        }

    System.out.println();

    }

}
}
