/**
 * Bubble sort algorithm
 */
package Numbers;

import java.util.*;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter no. of elements: ");
		int n = sc.nextInt();
		int a[] = new int[n];// initialising array
		System.out.print("Enter elements: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();// input
		sort(a, n);// calling function to sort
	}

	//Bubble Sort
	static void sort(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		System.out.print("\nSorted array: ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}
}
