package Basics;
import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        final double pi = 3.14;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Valur of r : ");
        final double r = scanner.nextDouble();
        scanner.close();

        final double area = pi*r*r;

        System.out.println("The Area of Circle is " + area);

    }
    
}
