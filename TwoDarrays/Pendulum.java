/**
 * Pendulum sort on a set of numbers
 */
package TwoDarrays;

import java.util.*;

public class Pendulum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i, j;
		System.out.println("Enter numbers: ");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println("Pendulum: ");
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		int d = n - 1, c = 0, x = n - 1;
		int b[] = new int[n];
		while (x >= 0) {
			b[d] = a[x];
			if (n % 2 == 1)
				if (x == 0)
					break;
			b[c] = a[x - 1];
			d--;
			c++;
			x = x - 2;
		}
		for (i = 0; i < n; i++)
			System.out.print(b[i] + " ");
	}
}
