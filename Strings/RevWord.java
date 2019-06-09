/**
 * Program to reverse each word in a sentence 
 */
package Strings;

import java.util.*;

public class RevWord {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        String a = sc.nextLine();
        String b = "";
        a = a + " ";
        int l = a.length();
        int i;
        System.out.println("Modified sentence: ");
        for (i = 0; i < l; i++) {
            char ch = a.charAt(i);
            if (ch != ' ') {
                b = ch + b;
            } else {
                System.out.print(b + " ");
                b = "";
            }
        }
    }
}
