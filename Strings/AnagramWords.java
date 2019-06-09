/**
 * Program to check if 2 words are anagram words, e.g. FLOW and WOLF
 */
package Strings;

import java.util.*;

public class AnagramWords {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter two words: ");
		String a = sc.nextLine();
		String b = sc.nextLine();
		if (sort(a).equalsIgnoreCase(sort(b)))
			System.out.println("Anagram words.");
		else
			System.out.println("Not anagram words.");
	}

	static String sort(String x) {
		int i, j, len = x.length();
		String s = "";
		for (i = 65; i <= 90; i++) {
			for (j = 0; j < len; j++) {
				char ch = x.charAt(j);
				if (ch == (char) i || ch == (char) (i + 32))
					s += ch;
			}
		}
		return s;
	}
}
