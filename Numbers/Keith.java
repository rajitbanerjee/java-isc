/**
 * Keith:
 * E.g. 14: 1 + 4 + 5 + 9 = 14 
 * 15: 1 + 5 + 6 + 11 = 17. But 17 > 15 Not Keith
 * Sum of numbers obtained by adding previous x numbers (x being the number
 * of digits in the input number), where the series begins with the digits 
 * of the numbers.
 * Program to check for Keith number.
 */
package Numbers;

import java.util.*;

public class Keith {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int n2 = n, dig, d, rev = 0, c = 0, x = 0, i, sum = 0;
		int a[] = new int[n];
		while (n2 > 0) {
			dig = n2 % 10;
			rev = rev * 10 + dig;
			n2 /= 10;
		}
		while (rev > 0) {
			d = rev % 10;
			c++;
			a[x++] = d;
			rev /= 10;
		}
		while (sum <= n) {
			sum = 0;
			for (i = 0; i < c; i++)
				sum += a[i];
			for (i = 0; i < c - 1; i++)
				a[i] = a[i + 1];
			a[c - 1] = sum;
		}
		if (sum == n)
			System.out.println("Keith,");
		else
			System.out.println("Not Keith!");
	}
}
