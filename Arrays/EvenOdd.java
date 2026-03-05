package Arrays;
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        findEvenOdd();

    }

    public static void findEvenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in an Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println(" Enter the Elements: ");
         for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
         }
         sc.close();

         int even = 0;
         int odd = 0;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
             }
            odd = (arr.length) - even;

         }
         System.out.println(Arrays.toString(arr));


         System.out.println("There are " + even + " Even Elements and " + odd +" Odd elements in an Array.");
    }
}
