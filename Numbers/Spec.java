/**
 * Program to check for Special number
 * 112233 is special 998877 995552222 repeated together
 * 1122123 not special 12234431 12321 490921 not repeated together
 */
package Numbers;

import java.util.*;

public class Spec {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int n2 = n, dig, x = 0;
		int a[] = new int[n];
		int b[] = new int[10];
		int k1 = 0, k = 0, i;
		while (n2 > 0) {
			dig = n2 % 10;
			a[x++] = dig;
			b[dig]++;
			n2 /= 10;
		}
		for (i = 0; i < 10; i++)
			if (b[i] != 0)
				k1++;
		for (i = 0; i < x - 1; i++)
			if (a[i] != a[i + 1])
				k++;
		if (k1 == k + 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
