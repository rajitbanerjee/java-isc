/**
 * Perform linear search recursively
 */
package RecursiveFunctions;

import java.util.*;

public class LinearSearch {
	static int c = 0;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter no. of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter elements: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print("Enter item to search: ");
		int x = sc.nextInt();// search element
		int f = search(a, x, n);
		if (f == 0 && c == 0)
			System.out.println("Element absent");
	}

	static int search(int a[], int x, int n) {
		if (n == 0)
			return 0;
		search(a, x, n - 1);
		if (a[n - 1] == x) {
			c = 1;
			System.out.println("Position: " + n);
		}
		return 0;
	}
}
