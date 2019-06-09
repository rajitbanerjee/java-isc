/**
 * Program to count the number of Palindromes in a sentence
 */
package Strings;

import java.util.*;

public class PalinCount {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter sentence: ");
		String a = sc.nextLine(); 
		a = a + " "; //adding blank space at the end
		int len = a.length(); //finding length of string
		String b = "", r = "";
		int i = 0, c = 0;
		for (i = 0; i < len; i++) {
			char ch = a.charAt(i); //extracting characters
			if (ch != ' ') { //forming words and their reverse
				b = b + ch;
				r = ch + r;
			} else {
				if (r.equalsIgnoreCase(b) && b.length() != 1)
					c++; //counting palindromes
				b = "";
				r = "";
			}
		}
		// printing number of palindromes in sentence
		System.out.println("No. of palindromes: " + c);
	}
}
