package Arrays;
import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
        countOccurances();
    }


    public static void countOccurances(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(" Enter the Eleemnts of an Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(" Enter the Element to count: ");
        int key = sc.nextInt();
        sc.close();

        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                count++;
            }

        System.out.println("The element " + key + " occurred " + count + " times in an Array.");


    }
}
}
