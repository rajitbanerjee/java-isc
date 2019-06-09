/**
 * Program checks for unique number (one that doesn't have any repeated digit)
 */
package Numbers;

import java.util.*;

public class Unique {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int f[] = new int[10];
		int i, c = 0;
		for (i = 0; i < 10; i++)
			f[i] = 0;
		int n2 = n, d = 0;
		while (n2 > 0) {
			d = n2 % 10;
			f[d]++;
			n2 /= 10;
		}
		for (i = 0; i < 10; i++)
			if (f[i] > 1)
				c = 1;
		if (c == 0)
			System.out.println("Unique number.");
		else
			System.out.println("Not unique.");
	}
}