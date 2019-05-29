/*
 * Sort matrix elements other than the boundary elements
 */
import java.util.*;

public class SortInner {
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
		for (i = 1; i < m - 1; i++) {
			for (j = 1; j < n - 1; j++) {
				for (k = 1; k < m - 1; k++) {
					for (l = 1; l < n - 1; l++) {
						if (a[i][j] < a[k][l]) {
							int t = a[i][j];
							a[i][j] = a[k][l];
							a[k][l] = t;
						}
					}
				}
			}
		}
		System.out.println("\nSorted inner part:");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i != 0 && i != m - 1 && j != 0 && j != n - 1)
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
