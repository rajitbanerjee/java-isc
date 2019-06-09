/**
 * Constructs a matrix of prime numbers
 */
package TwoDarrays;

import java.util.*;

public class PrimeMatrix {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of array (n x n): ");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int i = 0, j = 0, k = 2, f = 1;
		while (f <= n * n) { // inserting prime numbers in matrix
			if (prime(k) == 1) {
				a[i][j++] = k;
				if (j == n) {
					i++;
					j = 0;
				}
				f++;
			}
			k++;
		}
		System.out.println("\nPrime Matrix: ");
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(a[i][j] + "\t"); // printing matrix
			System.out.println();
		}
	}

	static int prime(int n) {// function to check prime number
		int c = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				c++;
		if (c <= 2)
			return 1;
		else
			return 0;
	}
}
