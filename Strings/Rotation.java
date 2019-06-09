/**
 * Program to find all the circular rotations of a word and print the first
 * and last words (lexicographically)
 */
package Strings;

import java.util.*;

public class Rotation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("\nEnter a word: ");
		String s = sc.nextLine().toUpperCase();
		int l = s.length(), i;
		String b = "", max = s, min = s;
		System.out.println("\nRotations: ");
		for (i = 0; i < l; i++) {
			b = s.substring(i) + s.substring(0, i);
			if (b.compareTo(max) > 0)
				max = b;
			else if (b.compareTo(min) < 0)
				min = b;
			System.out.println(b);
		}
		System.out.println("\nLexicographically,\nFirst word: " + min);
		System.out.println("Last word: " + max);
	}
}
