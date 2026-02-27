package IFElse;


import java.util.*;
public class gradeCalc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter obtained Marks in Science: ");
        final double sci = sc.nextDouble();

        System.out.println("Enter obtained Marks in Maths : ");
        final double math = sc.nextDouble();

        System.out.println("Enter obtained Marks in CS: ");
        final double cs = sc.nextDouble();

        double finalMarks = (sci + math + cs) /3;

        if (finalMarks >= 90) {
            System.out.println(finalMarks +"% : Grade A");
        } 
        else if (finalMarks < 90 && finalMarks >= 75) {
            System.out.println(finalMarks +"% : Grade B");
        } 
        else if (finalMarks < 75 && finalMarks >= 55) {
            System.out.println(finalMarks +"% : Grade C");
        } 
        else {
            System.out.println(finalMarks +"% : FAILED!!!");
        }
        sc.close();
    }
}
