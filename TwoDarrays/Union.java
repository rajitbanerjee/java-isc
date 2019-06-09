/**
 * Find the union of two sets of numbers
 */
package TwoDarrays;

import java.util.*;

public class Union {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter size of 1st array: ");
        int m = sc.nextInt();

        int a[] = new int[m];
        System.out.println("Enter elements:");
        for (i = 0; i < m; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter size of 2nd array: ");
        int n = sc.nextInt();

        int b[] = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++)
            b[i] = sc.nextInt();

        int c[] = new int[m + n];
        for (i = 0; i < m; i++)
            c[i] = a[i];
        for (i = 0; i < n; i++)
            c[i + m] = b[i];
        for (i = 0; i < m + n - 1; i++) {
            for (j = 0; j < m + n - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    int t = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = t;
                }
            }
        }
        for (i = 0; i < m + n; i++) {
            if (i == m + n - 1) {
                if (c[i] != c[0])
                    System.out.print(c[i] + " ");
            } else {
                if (c[i] != c[i + 1])
                    System.out.print(c[i] + " ");
            }
        }
    }
}
