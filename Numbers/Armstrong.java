/**
 * Program to print all Armstrong numbers in a range
 * Armstrong number: 153 = 1^3 + 5^3 + 3^3 (sum of cubed digits)
 */
package Numbers;

import java.util.*;

public class Armstrong {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter n:");
		int n = sc.nextInt();
		int i;
		System.out.println("\nArmstrong numbers less than " + n + ": ");
		for (i = 1; i <= n; i++) {
			if (arm(i) == true)
				System.out.println(i);
		}
	}

	static boolean arm(int n) {
		int n2 = n;
		int sum = 0, dig;
		while (n2 > 0) {
			dig = n2 % 10;
			sum = sum + dig * dig * dig;
			n2 /= 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}
}
