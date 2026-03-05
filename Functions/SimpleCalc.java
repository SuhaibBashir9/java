package Functions;
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
       simpCalc();
    }

    public static void simpCalc(){
        System.out.println("-------------- SIMPLE CALCULATOR ------------");

        System.out.println(" Choose Operation: ");
        System.out.println(" 1 : Addition: ");
        System.out.println(" 2 : Subtraction : ");
        System.out.println(" 3 : Multiplication : ");
        System.out.println(" 4 : Division: ");
        System.out.println(" 5 : Modulus: ");


        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();


        System.out.println(" Enter two Numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

      

        switch (key) {
            case 1:
                int sum = num1 + num2;
                System.out.println(" Sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            
            case 2:
                int sub = num1 - num2;
                System.out.println(" Subtraction of " + num1 + " and " + num2 + " is " + sub);    
                break;

            case 3:
                int mul = num1 * num2;
                System.out.println(" Multiplication of " + num1 + " and " + num2 + " is " + mul);    
                break;

            case 4:
                if (num2 != 0) {
                    int div = num1 / num2;
                    System.out.println(" Division of " + num1 + " and " + num2 + " is " + div);   
                } else if (num2 == 0){
                    System.out.println(" Division by zero is not allowed.");
                }
                break;
                
            case 5:
                int mod = num1 % num2;
                System.out.println(" Modulus of " + num1 + " and " + num2 + " is " + mod);
                break;


            default:
                break;
        }
        

    }
}
