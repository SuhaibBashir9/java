package Loops;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Palindrome();
    }

    public static void Palindrome(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int initailNum = sc.nextInt();
        int init = initailNum;
       
         int reversedNum = 0;
        do {
            int temp = initailNum % 10;
             reversedNum = reversedNum * 10 + temp;
            initailNum = initailNum /10;
        } while (initailNum > 0);

            System.out.println(reversedNum);

            if (reversedNum == init) {
                System.out.println("Palindrome Number ");
            } else {
                System.out.println("Not a Palindrome Number");              
            }
            sc.close();
    }
}
