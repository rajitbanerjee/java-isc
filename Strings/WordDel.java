/**
 * Program to delete a word at a specified position in a sentence
 */
package Strings;

import java.util.*;

public class WordDel {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String a = sc.nextLine(); //input
        System.out.println("Enter position to be deleted: ");
        int p = sc.nextInt(); //position in the sentence
        String b = "", s = "";
        a = a + " "; //adding space at the end
        int i, l = a.length(), f = 0;
        for (i = 0; i < l; i++) {
            char ch = a.charAt(i); //character extraction
            if (ch != ' ')
                b = b + ch;
            else {
                f++;
                //creating new string s
                if (f != p)
                    s = s + " " + b;
                b = "";
            }
        }
        System.out.println("\nNew Sentence: " + s);
    }
}
