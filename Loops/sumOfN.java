package Loops;
import java.util.*;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numberes ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("Enter the " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println(sum + " is the sum of " + n + " numbers");
        sc.close();
    }
    
}
