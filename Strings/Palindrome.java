package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String....");
        String str = sc.nextLine();
        sc.close();
        System.out.println("You entered: " + str);

        palindrom(str);
    }
    
     public static void palindrom(String str){
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            str2 += c;
        }
        System.out.println("Reverse is: " + str2);
        if (str.equals(str2)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is a NOT a Palindrome String.");
        }
    }
}
