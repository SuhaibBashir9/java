package Arrays;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of Elements in Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(" Enter the elements of an Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
           
            if (max < arr[i]) {
                max = arr[i];

            }            
        }
            System.out.println(max + " is the Maximum Element in An given Array.");

    }
}
