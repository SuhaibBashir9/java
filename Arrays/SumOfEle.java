package Arrays;
import java.util.Scanner;

public class SumOfEle {
    public static void main(String[] args) {
    //    int[] numbers = {10,20,30,40,50};

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of Elements in an Array");
    int n = sc.nextInt();

    int[] numbers = new int[n];
    int sum = 0;

 
    System.out.print("Enter the Elements of Array:");
    
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = sc.nextInt();

        sum += numbers[i];

    }
        System.out.println(sum + " is the sum of Elements of an Array.");
        sc.close();
    }
}
