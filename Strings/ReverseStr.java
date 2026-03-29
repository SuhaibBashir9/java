package Strings;

import java.util.Scanner;

public class ReverseStr {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String....");
        String str = sc.nextLine();
        sc.close();
        System.out.println("You entered: " + str);

        revStr(str);

    }

    public static void revStr(String str){
        String str2 = "      ";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.println(c);
            str2 += c;
        }
        System.out.println(str2);
    }

    
}
