
package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = findFact(n);
        System.out.println("Factorial of " + n + " is " + result);
    }

    public static int findFact(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFact(n - 1);
    }
}
        

