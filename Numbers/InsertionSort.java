/**
 * Perform insertion sort on an integer array
 */
package Numbers;

import java.util.*;

public class InsertionSort {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of array: ");
		int n = sc.nextInt(); // no. of array elements
		int a[] = new int[n + 1];
		a[0] = -999;

		System.out.println("Enter array elements: ");
		for (int i = 1; i <= n; i++)
			a[i] = sc.nextInt();

		int temp = 0, x = 0;
		for (int i = 1; i <= n; i++) { // Insertion Sort
			temp = a[i];
			x = i - 1;
			while (a[x] > temp) {
				a[x + 1] = a[x];
				x--;
			}
			a[x + 1] = temp;
		}
		System.out.println("Sorted array: ");
		for (int i = 1; i <= n; i++) // printing sorted array
			System.out.print(a[i] + " ");
	}
}