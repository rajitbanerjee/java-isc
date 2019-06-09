/**
 * Program to subtract a matrix from another
 */
import java.util.*;

public class Matrix {
	int arr[][], m, n;
	static Scanner sc = new Scanner(System.in);

	public Matrix(int mm, int nn) {
		m = mm;
		n = nn;
		arr = new int[m][n];
	}

	void fillArray() {
		System.out.println("Enter matrix elements: ");
		for (int i = 0; i < m; i++) {
			System.out.print("Row no. " + (i + 1) + ": ");
			for (int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		}
	}

	Matrix SubMat(Matrix A) {
		Matrix B = new Matrix(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				B.arr[i][j] = A.arr[i][j] - arr[i][j];
		}
		return B;
	}

	void display() {
		System.out.println("\nMatrix elements after subtraction: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				if (arr[i][j] >= 0)
					System.out.print(" " + arr[i][j] + "\t");
				else
					System.out.print(arr[i][j] + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter size of matrices: ");
		int m1 = sc.nextInt();
		int n1 = sc.nextInt();
		Matrix X = new Matrix(m1, n1);
		X.fillArray();
		Matrix Y = new Matrix(m1, n1);
		Y.fillArray();
		Matrix Z = new Matrix(m1, n1);
		Z = Y.SubMat(X);// X - Y
		Z.display();
	}
}
