import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of angle1: ");
        double angle1 = sc.nextDouble();

        System.out.println("Enter value of angle1: ");
        double angle2 = sc.nextDouble();

        System.out.println("Enter value of angle1: ");
        double angle3 = sc.nextDouble();

        double totalSum = angle1 + angle2 + angle3;

        if (totalSum == 180) {
            System.out.println("Triangle is Valiadated.");
        } else if (totalSum > 180) {
            System.out.println("Sum of Angles of triangle can't exceed 180.");
        } else{
            System.out.println("Triangle is not Valiadated.");
        }
        sc.close();
    }
    
}
