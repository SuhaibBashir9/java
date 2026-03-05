package Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements in Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to Find: ");
        int x = sc.nextInt();
        sc.close();
        boolean found = true;
        int foundIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                found = true;
                foundIndex = i;
                break;
            }
        }
        
            if (found && foundIndex != -1) {
                System.out.println(x + " found in an Array at " + foundIndex);
            } else {
                System.out.println(x + " element not Found.");
            }
    }
}
