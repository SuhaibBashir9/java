package IFElse;
import java.util.*;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for Vote");
        } else {
            System.out.println("UnderAge");
        }
        sc.close();
    }
}
