package Logic;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String word1 = "silent";
        String word2 = "listen";

        if (word1.length() != word2.length()) {
            System.out.println("Not Anagrams");
            return;
        }


        //Saw this code from gemini bcz i had not learned avout toCharArray and sort method of Arrays class. 
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();    
        Arrays.sort(array1);
        System.out.println(array1);
        Arrays.sort(array2);
        System.out.println(array2);

        boolean isAnagram = Arrays.equals(array1, array2);

        if (isAnagram) {
            System.out.println("Yes, they are anagrams!");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }
}
