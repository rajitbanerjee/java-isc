/**
 * Triangular numbers: 1+2 =3, 1 + 2 + 3 = 6, etc from 3 to n
 */
package Numbers;

import java.util.*;

public class Triangular {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int i, j, sum = 0;
		for (i = 2; sum <= n; i++) {
			for (j = 1; j <= i; j++)
				sum += j;
			if (sum > n)
				break;
			System.out.println(sum);
			sum = 0;
		}
	}
}