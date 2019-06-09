/**
 * Program to demonstrate the use of StringTokenizer
 */
package Strings;

import java.util.*;

public class Tokens {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a sentence: ");
		String a = sc.nextLine();
		//Creating String Tokenizer object st to operate on String a
		StringTokenizer st = new StringTokenizer(a);
		System.out.println("Enter a word to check frequency: ");
		String wd = sc.next(); //input word to check frequency
		int c = 0, f = st.countTokens(); //f stores number of tokens
		System.out.println("Tokens: ");
		while (st.hasMoreTokens()) {
			String b = st.nextToken(); //Storing next token in String b
			System.out.println(b); //Printing each token
			if (b.equalsIgnoreCase(wd))
				c++; //increasing counter if token matches required String wd
		}
		//Printing total number of tokens and frequency of wd
		System.out.println("Total no. of tokens: " + f);
		System.out.println("Frequency of " + wd + ": " + c);
	}
}
