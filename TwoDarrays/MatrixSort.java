/**
 * Perform bubble sort on a matrix and find max. element
 */
package TwoDarrays;

import java.util.*;

public class MatrixSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of matrix m x n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int i, j, k, l;
		for (i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + " : ");
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				for (k = 0; k < m; k++) {
					for (l = 0; l < n; l++) {
						if (a[i][j] < a[k][l]) {
							int t = a[i][j];
							a[i][j] = a[k][l];
							a[k][l] = t;
						}
					}
				}
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Max = " + a[m - 1][n - 1]);
	}
}