package Loops;
import java.util.Scanner;

public class strong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num = sc.nextInt();
        sc.close();

        findStrong(num);

    }
    
    public static void findStrong(int num){
        int temp , sum = 0;
        int originalNum = num;


        while (num > 0) {
            
         
            temp = num % 10;
            int fact = 1;

            for (int i = temp ; i > 0; i--) {
                fact *= i;

            }

                sum += fact;
                num = num /10;

        };

        if (sum == originalNum ) {
            System.out.println(originalNum + " is a Strong Number." );
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }

    }
}
 // Took me  a lot of time but i did it on my own no help from anyone or anything