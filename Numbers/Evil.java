/**
 * Evil number: Has an even no. of 1's in binary form
 * Program checks for an Evil number
 */
package Numbers;

import java.util.*;

public class Evil {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a no.");
		int a = sc.nextInt();
		String b = "";
		while (a > 0) {
			b = b + (a % 2);
			a = a / 2;
		}
		int l = b.length();
		int i;
		String rev = "";
		for (i = 0; i < l; i++) {
			char ch = b.charAt(i);
			rev = ch + rev;
		}
		int bin = Integer.parseInt(rev);
		int b2 = bin, d = 0, c = 0;
		while (b2 > 0) {
			d = b2 % 10;
			if (d == 1)
				c++;
			b2 /= 10;
		}
		System.out.println("Binary = " + bin);
		if (c % 2 == 0)
			System.out.println("EVIL");
		else
			System.out.println("NO");
	}
}