/**
 * Program to sort the vowels in a sentence only, then form a new sentence
 * with the vowels in their new positions 
 */
package Strings;

import java.util.*;

public class SortVow {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String op = "Y";
		int c = 0, f = 0;
		while (f == 0) {
			System.out.print("Enter a sentence: ");
			String s = sc.nextLine();
			c++;
			int i, j, x = 0, y = 0, z = 0, len = s.length();
			char a[] = new char[len];
			int arr[] = new int[len];
			String b = "";
			for (i = 0; i < len; i++) {
				char ch = s.charAt(i);
				if (Character.isUpperCase(ch))
					arr[z++] = i;
				if (vow(ch) == true)
					a[x++] = ch;
			}
			for (i = 0; i < x - 1; i++) {
				for (j = 0; j < x - i - 1; j++) {
					String m = ("" + a[j]).toUpperCase();
					String n = ("" + a[j + 1]).toUpperCase();
					if (m.compareTo(n) > 0) {
						char t = a[j];
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
			for (i = 0; i < len; i++) {
				char ch2 = s.charAt(i);
				if (vow(ch2) == true)
					ch2 = a[y++];
				b += Character.toLowerCase(ch2);
			}
			String b2 = "";
			int ff = 0;
			for (i = 0; i < b.length(); i++) {
				ff = 0;
				for (j = 0; j < z; j++)
					if (i == arr[j])
						ff = 1;
				if (ff == 1)
					b2 += Character.toUpperCase(b.charAt(i));
				else
					b2 += b.charAt(i);
			}
			System.out.println(b2);
			System.out.println("Total number of sentences displayed is " + c);
			f = 1;
			System.out.print("Do you wish to continue ? ");
			op = sc.nextLine();
			if (op.equalsIgnoreCase("Y"))
				f = 0;
		}
	}

	static boolean vow(char x) {
		x = Character.toUpperCase(x);
		if (x == 'A' || x == 'E' || x == 'I' || x == 'E' || x == 'U')
			return true;
		else
			return false;
	}
}
