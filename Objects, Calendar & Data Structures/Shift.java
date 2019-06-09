/**
 * Cyclic shift on a matrix
 */
import java.util.*;

public class Shift {
	int mat[][], m, n, i = 0, j = 0;
	static Scanner sc = new Scanner(System.in);

	public Shift(int mm, int nn) {
		m = mm;
		n = nn;
		mat = new int[m][n];
	}

	void input() {
		System.out.println("Enter matrix elements: ");
		for (i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + ": ");
			for (j = 0; j < n; j++)
				mat[i][j] = sc.nextInt();
		}
	}

	void cyclic(Shift P) {
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				if (i == m - 1)
					mat[i][j] = P.mat[0][j];
				else
					mat[i][j] = P.mat[i + 1][j];
			}
		}
	}

	void display() {
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)
				System.out.print(mat[i][j] + "\t");
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter size (m x n): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Shift A = new Shift(a, b);
		Shift B = new Shift(a, b);
		A.input();
		System.out.println("\nOriginal: ");
		A.display();
		B.cyclic(A);
		System.out.println("\nMatrix after shift: ");
		B.display();
	}
}
