package Loops;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
      
        ReversedNum();
    }

    public static void ReversedNum(){
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int initailNum = sc.nextInt();
       
         int reversedNum = 0;
        do {
            int temp = initailNum % 10;
             reversedNum = reversedNum * 10 + temp;
            initailNum = initailNum /10;
        } while (initailNum > 0);

            System.out.println(reversedNum);
            sc.close();
    }
}
