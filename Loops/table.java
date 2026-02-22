package Loops;
import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int tableOf = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mul = tableOf * i;
            System.out.println(tableOf + " multiplied by " + i + " = " + mul);
        }
        sc.close();
        }
    
}
