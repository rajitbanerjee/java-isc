/**
 * Program to encode a string by shifting its letters by a certain number
 */
package Strings;

import java.util.*;

public class Encode {
    static String str;
    static int len;
    static Scanner sc = new Scanner(System.in);

    public Encode(String s) {
        str = s;
        len = str.length();
    }

    void change(Encode A, int n) {
        String b = "";
        for (int i = 0; i < A.len; i++) {
            char ch = A.str.charAt(i);
            int k;
            if (Character.isLetter(ch)) {
                k = ch + n;
                if (Character.isUpperCase(ch)) {
                    if (k > 90)
                        k -= 26;
                    if (k < 65)
                        k += 26;
                }
                if (Character.isLowerCase(ch)) {
                    if (k > 122)
                        k -= 26;
                    if (k < 97)
                        k += 26;
                }
                b += (char) k;
            } else
                b += ch;
        }
        System.out.println("Encoded string: " + b);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string to encode: ");
        str = sc.nextLine();
        Encode E = new Encode(str);
        System.out.print("Enter shift number: ");
        int n = sc.nextInt();
        E.change(E, n);
    }
}
