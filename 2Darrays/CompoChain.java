
/*
 * Displays the longest chain of composite numbers in a range
 */
import java.util.*;

public class CompoChain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Assuming there exists a longest range
		System.out.println("\nEnter m and n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int i, x = 0, y = 0, r1 = 0, r2 = 0;
		int a[] = new int[n];
		int d[] = new int[n];
		for (i = m; i <= n; i++)
			if (prime(i) == 1)
				a[x++] = i;
		for (i = 0; i < x - 1; i++)
			d[y++] = a[i + 1] - d[i];
		int max = d[0];
		for (i = 0; i < y; i++) {
			if (d[i] > max)
				max = d[i];
			r1 = i;
			r2 = i + 1;
		}
		r1 = a[r1];
		r2 = a[r2];
		System.out.println("\nLongest chain of composite numbers: ");
		for (i = r1 + 1; i < r2; i++)
			System.out.print(i + " ");
	}

	static int prime(int n) {
		int i, c = 0;
		for (i = 1; i <= n; i++)
			if (n % i == 0)
				c++;
		if (c == 2)
			return 1;
		else
			return 0;
	}
}
