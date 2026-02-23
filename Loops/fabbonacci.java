package Loops;
import java.util.Scanner;

public class fabbonacci {
    public static void main(String[] args) {
  
        printFabbonacci(10);
    }


public static void printFabbonacci(int n){
          int a =0;
        int b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n: ");
        n = sc.nextInt();

        sc.close();
        System.out.println(a);
        System.out.println(b);


        for (int i = 1; i < n; i++) {
            int next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
}
}