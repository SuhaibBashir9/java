package Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        perfectNum();
    }

    public static void perfectNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is the Perfect Number.");
        } else {
            System.out.println(num + " is not the Perfect Number.");
        }
    }
}
