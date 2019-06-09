/**
 * Program to generate a sequence of "Fibonnaci strings"
 */
package Strings;

import java.util.*;

public class FiboString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter no. of terms: ");
        int n = sc.nextInt();
        String a = "a", b = "b", c = "";
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = b + a;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}