package Loops;
import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number...");
        int num = sc.nextInt();
        sc.close();

        countNumbers(num);
    }

    public static void countNumbers(int num){
        
        int count = 0;

        do {
            num = num / 10;
           count++;    
        } while (num > 0);
        System.out.println(count + " is the count of Numbers.");
    }
    
}