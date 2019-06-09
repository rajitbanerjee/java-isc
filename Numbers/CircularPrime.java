/**
 * Circular Prime: A prime number which remains prime in all the circular 
 * permutations of its digits.
 * Program to check circular prime
 */
package Numbers;

import java.util.*;

public class CircularPrime {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.print("N = ");
		int n = sc.nextInt();
		String s = "" + n, b = "";
		int i, len = s.length(), f = 0;
		for (i = 0; i < len; i++) {
			b = s.substring(i) + s.substring(0, i);
			System.out.println(b);
			if (isPrime(b) == true)
				f++;
		}
		if (f == len)
			System.out.println(n + " IS A CIRCULAR PRIME");
		else
			System.out.println(n + " IS NOT A CIRCULAR PRIME");
	}

	static boolean isPrime(String b) {
		int n = Integer.valueOf(b);
		int c = 0;
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				c++;
		if (c == 2)
			return true;
		else
			return false;
	}
}
