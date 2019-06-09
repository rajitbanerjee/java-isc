/**
 * Display upper and lower triangular parts of matrix
 */
package TwoDarrays;

import java.util.*;

public class Halves {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int i, j;
		for (i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + " : ");
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nUpper Half:");
		for (i = 0; i < m; i++) {// upper half
			for (j = 0; j < n; j++)
				if (j >= i)
					System.out.print(a[i][j] + "\t");
				else
					System.out.print("\t");
			System.out.println();
		}
		System.out.println("\nLower Half:");
		for (i = 0; i < m; i++) {
			for (j = 0; j <= i; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}
}