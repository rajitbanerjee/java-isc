/**
 * Program to find the number of vowels and consonants in a sentence
 */
package Strings;

import java.util.*;

public class VowCons {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence:");
        String a = sc.nextLine().toUpperCase();
        String b = "";
        a = a + " ";
        int l = a.length();
        int c = 0, v = 0;
        System.out.println("\t Words\t\tVowels\tConsonants");
        for (int i = 0; i < l; i++) {
            char ch = a.charAt(i); //character extraction
            if (ch != ' ')
                b += ch;
            else {
                b = b + " ";
                int len = b.length();
                for (int j = 0; j < len; j++) {
                    char ch2 = b.charAt(j);
                    if (ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')
                        v++;
                    else if (Character.isLetter(ch2))
                        c++;
                }
                if (c != 0 || v != 0) {
                    System.out.printf("%15s", b);
                    System.out.println("\t\t" + v + "\t" + c);
                    b = "";
                    c = 0;
                    v = 0;
                }
            }
        }
    }
}
