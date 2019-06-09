/**
 * Program to remove duplicate words from a sentence
 */
package Strings;

import java.util.*;

public class DuplicateWords {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		s = s + " ";
		int l = s.length();
		int i, j, x = 0;
		String b = "";
		String a[] = new String[l];
		for (i = 0; i < l; i++) {
			char ch = s.charAt(i);
			if (ch != ' ')
				b = b + ch;
			else {
				a[x++] = b;
				b = "";
			}
		}
		for (i = 0; i < x; i++) {
			for (j = 0; j < i; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					if (i != j)
						a[i] = "";
				}
			}
		}
		System.out.println("New sentence: ");
		for (i = 0; i < x; i++) {
			if (a[i] != null)
				System.out.print(a[i] + " ");
		}
	}
}
