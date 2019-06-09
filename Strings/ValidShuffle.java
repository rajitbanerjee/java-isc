/**
 * Program to check if a string is a valid shuffle/rearrangement of 
 * two other strings
 */
package Strings;

import java.util.*;

public class ValidShuffle {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two strings having no common letter: ");
		String a = sc.next().toLowerCase();
		String b = sc.next().toLowerCase();
		System.out.println("Enter shuffled string: ");
		String c = sc.next().toLowerCase();
		int lc = c.length(), la = a.length(), lb = b.length();
		int i;
		if (lc != la + lb) {
			System.out.println("Error. Try again.");
			return;
		}
		String a1 = "", b1 = "";
		for (i = 0; i < lc; i++) {
			char ch = c.charAt(i);
			if (isPart(ch, a) == true)
				a1 += ch;
			else if (isPart(ch, b) == true)
				b1 += ch;
		}
		if (a1.equals(a) && b1.equals(b))
			System.out.println("Valid shuffle.");
		else
			System.out.println("Invalid shuffle.");
	}

	static boolean isPart(char ch, String x) {
		int len = x.length();
		for (int i = 0; i < len; i++) {
			char c = x.charAt(i);
			if (c == ch)
				return true;
		}
		return false;
	}
}
