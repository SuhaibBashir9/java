package Loops;

import java.util.Scanner;


// Did this but had the confusion in how to run the loop from 2 to sart of n , so had a little help from copilot

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println(" Enter the Value of num : ");
        int num = sc.nextInt();
        sc.close();

        findPrime(num);
    }

    public static void findPrime(int num){
          if (num <= 1) {
            System.out.println(num + " is not a Prime Number.");
            return;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
           if (num % i == 0) {
                System.out.println(num + " is not the prime number.");
                break;
            } else {
                System.out.println(num + " is the Prime Number.");
                break;
            }
        }
    }
}
