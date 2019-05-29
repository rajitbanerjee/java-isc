
/*
 * Find the product of 2 matrices
 */
import java.util.*;

public class MatrixProd {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of matrix A (r1 x c1):");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		System.out.println("Enter size of matrix B (r2 x c2):");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		if (c1 != r2)
			System.out.println("Product impossible.");
		else {
			int a[][] = new int[r1][c1];
			int b[][] = new int[r2][c2];
			int p[][] = new int[r1][c2];
			int i, j, k, s = 0;
			System.out.println("Matrix A");
			for (i = 0; i < r1; i++) {
				System.out.print("Row no. " + (i + 1) + " : ");
				for (j = 0; j < c1; j++)
					a[i][j] = sc.nextInt();
			}
			System.out.println("Matrix B");
			for (i = 0; i < r2; i++) {
				System.out.print("Row no. " + (i + 1) + " : ");
				for (j = 0; j < c2; j++)
					b[i][j] = sc.nextInt();
			}
			System.out.println("Product:");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					for (k = 0; k < r2; k++)
						s += a[i][k] * b[k][j];
					p[i][j] = s;
					s = 0;
				}
			}
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++)
					System.out.print(p[i][j] + "\t");
				System.out.println();
			}
		}
	}
}
