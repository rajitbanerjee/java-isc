/**
 * Program computes the Mobius function of a number
 */
package Numbers;

import java.util.*;

public class Mobius {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a natural number(-1 to exit): ");
            int n = sc.nextInt();
            if (n == -1)
                return;
            System.out.println("Mobius(" + n + ") = " + mob(n));
        }
    }

    static int mob(int n) {
        int copy = n;
        int x = 0, k = 2, c = 0;
        while (n > 1) {
            c = 0;
            while (n % k == 0) {
                c++;
                x++; // no. of prime factors
                n /= k;
            }
            k++;
            if (c > 1)
                return 0; // condition for squared prime factors
        }
        if (copy == 1)
            return 1;
        else {
            if (x == 0)
                return 0;
            return (int) Math.pow(-1, x); // returns 1 or -1 depending on even or odd no. of prime factors
        }
    }
}
