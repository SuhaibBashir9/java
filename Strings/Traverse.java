package Strings;

import java.util.Scanner;

public class Traverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String....");
        String str = sc.nextLine();
        sc.close();
        System.out.println("You entered: " + str);
        
        traveseStr(str);
    }

    public static void traveseStr(String str){
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }

}