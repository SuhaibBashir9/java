package Loops;
import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();
        sumOfNumbers(num);
    }

    public static void sumOfNumbers(int num){
        int temp =0;
        int sum = 0;
        int originalNum = num;

        do {
            temp = num % 10;
            sum += temp;
            num = num / 10;
        } while (num > 0);

        System.out.println(sum + " is the sum of Digits of " + originalNum);
    }
}
