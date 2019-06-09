/**
 * Finds the maximum negative and minimum positive number
 */
package Numbers;

import java.util.*;

public class MaxnegMinpos {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i, j, max = 0, min = 0;
        System.out.println("Enter elements: ");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (a[0] > 0) {
                min = a[0];
                System.out.println("No negatives. Min +ve: " + min);
                System.exit(0);
            }
            if (a[i] > 0) {
                min = a[i];
                max = a[i - 1];
                break;
            }
        }
        System.out.println("Min +ve:  " + min);
        System.out.println("Max -ve: " + max);
    }
}