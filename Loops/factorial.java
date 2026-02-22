package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int fact = 1;

        for (int i = num; i > 0; i--) {
            fact *= i;
        }

        System.out.println(fact + " is the factorial of " + num);
        sc.close();
    }
    
}
