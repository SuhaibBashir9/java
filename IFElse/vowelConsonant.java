package IFElse;


import java.util.*;

public class vowelConsonant{
    public static void main(String[] args) {
        String vowels = "aeiou";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        String ch = sc.next();


        // I didnt know about this logic , so i did some digging through copilot and learned how this {inddexOf() == -1} works , then did it . 
        if (vowels.indexOf(ch) == -1) {
            System.out.println(ch + " is a Consonant");
        } else{
            System.out.println(ch + " is a Vowel.");
        }
        sc.close();
    }
}