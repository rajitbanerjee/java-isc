/**
 * Perform selection sort on an integer array
 */
package Numbers;

import java.util.*;

public class SelectionSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter no. of elements: ");
		int n = sc.nextInt();// no. of array elements
		int a[] = new int[n], p = 0, min = 0;
		System.out.print("Enter elements: ");
		for (int i = 0; i < n; i++)// entering array elements
			a[i] = sc.nextInt();
		sort(a, min, p, n);// calling sort() function
	}

	static void sort(int a[], int min, int p, int n) {
		for (int i = 0; i < n - 1; i++) {// Selection Sort
			min = a[i];
			p = i;
			for (int j = i; j < n; j++)
				if (a[j] < min) {
					min = a[j];
					p = j;
				}
			int t = a[i];
			a[i] = a[p];
			a[p] = t;
		}
		System.out.print("\nSorted array: ");
		for (int i = 0; i < n; i++)// printing sorted array
			System.out.print(a[i] + " ");
	}
}
