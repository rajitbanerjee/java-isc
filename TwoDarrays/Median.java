/**
 * Find the median from a set of numbers
 */
package TwoDarrays;

import java.util.*;

public class Median {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter size: ");
		int n = sc.nextInt();
		int i, j, a[] = new int[n], c = 0, mid = 0, mid2 = 0;
		System.out.println("Enter numbers: ");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();
		if (n % 2 == 1) {
			for (i = 1;; i++) {
				for (j = 0; j < n; j++)
					if (i == a[j])
						c++;
				if (c == n / 2) {
					mid = i;
					break;
				}
			}
			System.out.println("Median: " + mid);
		} else {
			double avg = 0;
			for (i = 1;; i++) {
				for (j = 0; j < n; j++)
					if (i == a[j])
						c++;
				if (c == (n / 2) - 1)
					mid2 = i;
				if (c == n / 2) {
					mid = i;
					break;
				}
			}
			avg = (mid + mid2) / 2;
			System.out.println("Median: " + avg);
		}
	}
}
