/**
 * 6174 is known as Kaprekar's constant[1][2][3] after the Indian mathematician 
 * D. R. Kaprekar. This number is notable for the following rule:
 * 1. Take any four-digit number, using at least two different digits. 
 *     (Leading zeros are allowed.
 * 2. Arrange the digits in descending and then in ascending order to get 
 *    two four-digit numbers, adding leading zeros if necessary.
 * 3. Subtract the smaller number from the bigger number.
 * 4. Go back to step 2 and repeat.
 * 
 * The above process, known as Kaprekar's routine, will usually reach its 
 * fixed point, 6174, in at most 8 iterations.
 * 
 * Program to find the last iterating of the above routine.
 */
package Numbers;

import java.util.*;

public class KaprekarCon {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a 4 dig. number with at least 2 diff. digits: ");
        int n = sc.nextInt();
        int f = 0, n2 = n, d = 0, x = 0, i, j;
        int arr[] = new int[4];
        while (f <= 7) {
            x = 0;
            while (n2 > 0) {
                d = n2 % 10;
                arr[x++] = d;
                n2 /= 10;
            }
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
            int de = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
            int m = de, dig, as = 0;
            while (m > 0) {
                dig = m % 10;
                as = as * 10 + dig;
                m /= 10;
            }
            int diff = de - as;
            if (diff == 6174) {
                System.out.println(de + " - " + as + " = 6174");
                break;
            } else {
                f++;
                n2 = diff;
            }
        }
        if (f == 7)
            System.out.println("NO.");
    }
}
