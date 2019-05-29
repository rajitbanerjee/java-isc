/*
 * Checking if a matrix is symmetric and finding the sum of its diagonals
 */
import java.util.*;

public class Symmetric {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter size of matrix m:");
		int m = sc.nextInt();
		int a[][] = new int[m][m];
		int i, j, ld = 0, rd = 0, f = 0;
		System.out.println("Matrix input:");
		for (i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + " : ");
			for (j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < m; i++) {// checking if matrix is symmetric
			for (j = 0; j < m; j++) {
				if (a[i][j] != a[j][i]) {
					f = 1;
					break;
				}
			}
		}
		if (f == 0)
			System.out.println("\nSymmetric matrix.");
		else
			System.out.println("\nAsymmetric matrix.");
		// Sum of diagonals
		for (i = 0; i < m; i++) {
			for (j = 0; j < m; j++) {
				if (i == j)
					ld += a[i][j];
				if ((i + j) == m - 1)
					rd += a[i][j];
			}
		}
		System.out.println("Left diagonal sum = " + ld);
		System.out.println("Right diagonal sum = " + rd);
	}
}
