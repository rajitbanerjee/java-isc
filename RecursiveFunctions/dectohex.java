/**
 * Base conversion: Decimal to Hexadecimal
 */
package RecursiveFunctions;

import java.util.*;

public class DecToHex {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("\nEnter a decimal number: ");
		int n = sc.nextInt();
		System.out.println("Hexadecimal: " + hex(n));
	}

	static String hex(int n) {
		if (n == 0)
			return "";
		if (n % 16 > 9)
			return hex(n / 16) + (char) (n % 16 + 55);
		else
			return hex(n / 16) + (n % 16);
	}
}