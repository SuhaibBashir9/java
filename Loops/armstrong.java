package Loops;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        int temp = 0;
        int some = 0;
        int originalNum = num;

      do {
            temp = num % 10;
            some += Math.powExact(temp, 3);
            num = num/ 10;
        } while (num > 0);

            if (some == originalNum) {
        System.out.println(originalNum + " is an Armstrong Number");
            } else {
        System.out.println(originalNum + " is not an Armstrong Number");
            }

            sc.close();
        }
      
    }
    

