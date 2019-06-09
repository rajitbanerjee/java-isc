/**
 * Program to display Pascal's triangle
 */
package TwoDarrays;

import java.util.*;

public class Pascal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter no. of lines : ");
		int n = sc.nextInt();
		int a[][] = new int[n][n];// initialising array
		System.out.println("Pascal's Triangle: ");
		int i, j;
		a[0][0] = a[1][0] = a[1][1] = 1;
		for (i = 2; i < n; i++) {
			a[i][0] = a[i][i] = 1;
			for (j = 1; j < i; j++)
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
		}
		for (i = 0; i < n; i++) {// printing
			for (j = 0; j <= i; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}
}
