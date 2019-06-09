/*
 * Check prime recursively
 */
package RecursiveFunctions;

import java.util.*;

public class IsPrime {
	static Scanner sc = new Scanner (System.in);
	static int n, i = 2;

	public static void main(String[] args) {
		System.out.print("Enter a number to check prime: ");
		int n = sc.nextInt();
		System.out.println(check(n, 2));
	}

	static int check(int n, int x) {
		if (x < n) {
			if (n % x != 0)
				return check(n, ++x);
			return 0;
		}
		return 1;
	}
}
