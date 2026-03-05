package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        copyArray();
    }

    public static void copyArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] copyArr = new int[n];


        System.out.println(" Enter the Elemnts of an Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.close();
        }

        System.out.println("Original Array" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
             copyArr[i] = arr[i]; 
        }

        // We can also use these methods to create the copy of an array automatically. 
        // int[] copyArr = arr.clone();
        // int[] copyArr = Arrays.copyOf(arr, n);

        System.out.println("Copied Array" + Arrays.toString(copyArr));

    }
}
