/**
 * Sort only the boundary elements of a matrix
 */
package TwoDarrays;

import java.util.*;

public class BoundarySort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of matrix m x n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		int b[] = new int[m * n - (m - 2) * (n - 2)];
		int i, j, x = 0, y = 0;
		for (i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + " : ");
			for (j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					b[x++] = a[i][j];
			}
		}
		for (i = 0; i < x - 1; i++) {
			for (j = 0; j < x - 1 - i; j++) {
				if (b[j] > b[j + 1]) {
					int t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		for (i = 0; i < n - 1; i++)
			a[0][i] = b[y++];
		for (i = 0; i < m - 1; i++)
			a[i][n - 1] = b[y++];
		for (i = m - 1; i > 0; i--)
			a[n - 1][i] = b[y++];
		for (i = n - 1; i > 0; i--)
			a[i][0] = b[y++];
		System.out.println("\nSorted boundary: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
					System.out.print(a[i][j] + "\t");
				else
					System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("\nNew matrix:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println("\n");
		}
	}
}
