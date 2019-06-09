/**
 * Program to sort a sentence by the length of its words
 */
package Strings;

import java.util.*;

public class LenSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Input a sentence (without punctuation marks): ");
		String a = sc.nextLine().toLowerCase();
		a = a + " ";
		int l = a.length();
		String arr[] = new String[l];
		int len[] = new int[l];
		int i, j, x = 0, y = 0;
		String b = "";
		for (i = 0; i < l; i++) {
			char ch = a.charAt(i);
			if (ch != ' ')
				b = b + ch;
			else {
				arr[x++] = b;
				len[y++] = b.length();
				b = "";
			}
		}
		for (i = 0; i < x + 1 - i; i++) {
			for (j = 0; j < x - i; j++) {
				if (len[j] > len[j + 1]) {
					int t = len[j];
					len[j] = len[j + 1];
					len[j + 1] = t;
					String m = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = m;
				}
			}
		}
		System.out.println("\nSorted sentence: ");
		for (i = 0; i < x + 1; i++)
			if (arr[i] != null)
				System.out.print(arr[i] + " ");
	}
}
