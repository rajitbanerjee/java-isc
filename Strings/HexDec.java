/**
 * Base conversion: Hexadecimal to decimal
 */
package Strings;

import java.util.*;

public class HexDec {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a hex number:");
        String hex = sc.nextLine();
        int l = hex.length();
        int i, s = 0, x = 0, n = 0;
        for (i = l - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            if (ch != 'A' && ch != 'B' && ch != 'C' && ch != 'D' && ch != 'E' && ch != 'F') {
                n = ch - 48;
                s += (int) Math.pow(16, x++) * n;
            } else {
                n = ch - 55;
                s += (int) Math.pow(16, x++) * n;
            }
        }
        System.out.println("Decimal: " + s);
    }
}
