package Logic;

import java.util.Scanner;
public class FindTheMissingNum {  

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n ; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int expectedSum = (n + 1) * (n + 2) / 2;
        
        int actualSum = 0;
       for(int i = 0; i < n; i++) {
            actualSum += nums[i];
        }
        
        int missingNumber = expectedSum - actualSum;
        
        System.out.println("The missing number is: " + missingNumber);
    }
}
