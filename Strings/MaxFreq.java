/**
 * Program to find the most frequent letter in a string
 */
package Strings;

import java.util.*;

public class MaxFreq {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		int freq[] = new int[26];
		int i, l = s.length(), p = 0;
		for (i = 0; i < l; i++) {
			char ch = s.charAt(i);
			if (ch != ' ')
				freq[ch - 65]++;
		}
		int max = freq[0];
		for (i = 0; i < 26; i++) {
			if (freq[i] > max) {
				max = freq[i];
				p = i + 65;
			}
		}
		System.out.println("Max. frequency = " + (char) (p));
		char x = (char) (p);
		if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
			System.out.println(x + " is a vowel.");
		else
			System.out.println(x + " is a consonant.");
	}
}
