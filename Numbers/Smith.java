/**
 * Sum of digits = sum of digits of prime factors
 * Eg. 4, 22, 666
 * Not smith - 102, 999
 * Program checks for Smith numbers
 */
package Numbers;

import java.util.*;

public class Smith {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("INPUT: ");
        int n = sc.nextInt(); // input
        int n2 = n, s1 = 0, s2 = 0, i = 2;// variable initialisation
        s1 = sod(n);// finding sum of digits
        while (i <= n / 2) {
            if (n2 % i == 0) {
                s2 += sod(i);// finding sum of digits of prime factors
                n2 /= i;
            } else
                i++;
        }
        System.out.print("OUTPUT: ");
        if (s1 == s2)
            System.out.print("SMITH NUMBER");
        else
            System.out.println("NOT SMITH NUMBER");
    }

    static int sod(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;// sum of digits
            n /= 10;
        }
        return sum;
    }
}
