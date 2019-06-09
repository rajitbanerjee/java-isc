/**
 * Lucky numbers: From the sequence of natural numbers, first remove every 2nd 
 *  number, then from the remaining, remove every 3rd number, then every fourth,
 *  fifth,..., and so on. The numbers left are called Lucky numbers.
 *  Program to find the lucky numbers less than N
 */
package Numbers;

import java.util.*;

public class Lucky {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("INPUT N: ");
		int n = sc.nextInt(), k = 2, i;
		int a[] = new int[n];
		for (i = 0; i < n; i++)
			a[i] = i + 1;
		while (true) {
			int c = 0;
			for (i = 0; i < n; i++) {
				if (a[i] != 0)
					c++;
				if (c == k) {
					a[i] = 0;
					c = 0;
				}
			}
			display(a);
			k++;
			if (k > n / 2 + 1)
				break;
		}
		System.out.print("OUTPUT: ");
		for (i = 0; i < n; i++)
			if (a[i] != 0)
				System.out.print(a[i] + " ");
	}

	static void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
