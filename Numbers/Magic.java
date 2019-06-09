/**
 * Magic number: eventual sum of digits = 1
 * Program to check for Magic number
 */
package Numbers;

import java.util.*;

public class Magic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int n2 = n, sum = 0, m = n;
        while (m > 9) {
            n2 = m;
            sum = 0;
            while (n2 > 0) {
                sum += n2 % 10;
                n2 /= 10;
            }
            m = sum;
        }
        if (m == 1)
            System.out.println("Magic");
        else
            System.out.println("Not a magic number!");
    }
}