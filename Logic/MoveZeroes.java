package Logic;

import java.util.Scanner;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:"); 
        int size = sc.nextInt();
        int[] nums = new int[size];
        
        int p = 0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p] = nums[i];
                p++;
            }
        }
        
    
        while (p < nums.length) {
            nums[p] = 0;
            p++;
        }
       
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}