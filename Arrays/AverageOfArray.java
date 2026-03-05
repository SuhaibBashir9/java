package Arrays;
import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        double sum = 0;
        double average = 0;

        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();

        average = sum / arr.length;

        System.out.println(average + " is the average of given Array. ");

    }
}
