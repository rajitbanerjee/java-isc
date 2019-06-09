/**
 * Program to check for Palindrome (string/number)
 */
package Strings;

import java.util.*;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int ch = 0;// initialising choice to 0;
        while (true) {
            System.out.println("\n1. Palindrome String");
            System.out.println("2. Palindrome Number");
            System.out.println("3. Exit");
            System.out.println("Enter choice: ");
            ch = sc.nextInt();// entering choice
            switch (ch) {
            case 1: // Palindrome String
                System.out.println("Enter a word: ");
                String s = sc.next();
                int l = s.length();
                String b = "";
                for (int i = 0; i < l; i++)
                    b = s.charAt(i) + b;
                if (b.equalsIgnoreCase(s))
                    System.out.println("Palindrome.");
                else
                    System.out.println("No.");
                break;
            case 2: // Palindrome Number
                System.out.println("Enter a number: ");
                int n = sc.nextInt(), n2 = n, d, rev = 0;
                while (n2 > 0) {
                    d = n2 % 10;
                    rev = rev * 10 + d;
                    n2 /= 10;
                }
                if (rev == n)
                    System.out.println("Palindrome.");
                else
                    System.out.println("No.");
                break;
            case 3:
                return;
            default:
                System.out.println("Wrong input. Try Again!");
            }
        }
    }
}
