/**
 * Sum of series: x + x^2 + x^3 + ... + x^n
 */
package RecursiveFunctions;

import java.util.*;

public class SeriesSum {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter x and n: ");
		int x = sc.nextInt();
		int n = sc.nextInt();
		int s = 0;
		for (int i = 1; i <= n; i++)
			s += pow(x, i); // calculating sum
		System.out.println("Sum = " + s);
	}

	static int pow(int x, int n) {
		// Recursive function to evaluate x^n
		if (n == 0)
			return 1;
		return x * pow(x, n - 1);
	}
}
