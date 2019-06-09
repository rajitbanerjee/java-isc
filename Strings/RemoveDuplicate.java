/**
 * Program to remove consecutive duplicate characters from a word
 */
package Strings;

import java.util.*;

public class RemoveDuplicate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String a = sc.next(); 
        a = a + " "; //adding a space at the end
        String b = "";
        int i, l = a.length();
        for (i = 0; i < l - 1; i++) {
            char ch = a.charAt(i); //extracting characters
            char ch2 = a.charAt(i + 1);
            if (ch != ch2)
                b = b + ch; //creating new string
        }
        System.out.println("\nAfter removing duplicates: " + b);
    }
}
