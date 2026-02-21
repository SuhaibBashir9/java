import java.util.*;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight in KG: ");
        final double weight = sc.nextDouble();

        System.out.println("Enter the Height in meters : ");
        final double height = sc.nextDouble();

        sc.close();

        final double bmi = weight/ (height*height);
        System.out.println("BMI = " + bmi);

        if(bmi < 18.5){
            System.out.println("Category : Light Weight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal Weight");
        } else if (bmi >= 25 && bmi > 30) {
            System.out.println("Category:  OverWeight");
        } else{
            System.out.println("Category: Obese");
        }
        
    }
}
