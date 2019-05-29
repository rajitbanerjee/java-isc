/*
 * Display sum of each individual row and column of input matrix
 */
import java.util.*;

public class SumOfRowColumns {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter n (rows) and m (columns): ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a[][] = new int[n + 1][m + 1];
		int i, j, s1 = 0, s2 = 0;
		for (i = 0; i < n; i++) {
			System.out.print("Row no. " + (i + 1) + " : ");
			for (j = 0; j < m; j++)
				a[i][j] = sc.nextInt(); // input array elements
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				s1 += a[i][j];
				a[i][m] = s1;
			}
			s1 = 0;
		}
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				s2 += a[j][i];
				a[n][i] = s2;
			}
			s2 = 0;
		}

		// display array
		System.out.println("\nSum of each row displayed on the last column.");
		System.out.println("Sum of each column displayed on the last row.\n");
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= m; j++) {
				if (a[i][j] != 0)
					System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
