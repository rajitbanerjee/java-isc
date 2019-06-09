/**
 * Checks whether a number is a multiple of two different primes
 */
package Numbers;

import java.util.*;

public class PrimeMultiple {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int x = 0, c = 0, i;
		for (i = 2; i < n; i++) {
			if (n % i == 0)
				a[x++] = i;
		}
		if (x == 2) {
			for (i = 0; i < 2; i++) {
				if (prime(a[i]) == 1)
					c++;
			}
		}
		if (c == 2) {
			System.out.println("(" + a[0] + " x " + a[1] + ")");
			System.out.println("YES");
		} else
			System.out.println("NO");
	}

	static int prime(int a) {
		int f = 0;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0)
				f++;
		}
		if (f > 2)
			return 0;
		else
			return 1;
	}
}
