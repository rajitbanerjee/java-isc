/**
 * Program to replace a word in a sentence
 */
package Strings;

import java.util.*;

public class StringReplace {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a sentence:");
		String a = sc.nextLine();
		System.out.println("Enter a word:");
		String w = sc.next();
		System.out.println("Enter replacement:");
		String s = sc.next();
		String b = "";
		a = a + " ";
		int i, l = a.length();
		for (i = 0; i < l; i++) {
			char ch = a.charAt(i);
			if (ch != ' ')
				b = b + ch;
			else {
				if (b.equalsIgnoreCase(w))
					b = s;
				System.out.print(b + " ");
				b = "";
			}
		}
	}
}