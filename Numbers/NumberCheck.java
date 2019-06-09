/**
 * Menu driven program to check for different types of numbers
 */
package Numbers;

import java.util.*;

public class NumberCheck {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int ch = 0;// initialising choice to 0;
		while (true) {
			System.out.println("\n1. Armstrong");
			System.out.println("2. Perfect");
			System.out.println("3. Prime");
			System.out.println("4. Special");
			System.out.println("5. Exit");
			System.out.println("Enter choice: ");
			ch = sc.nextInt();// entering choice
			switch (ch) {
			// Armstrong
			case 1:
				System.out.println("Enter number: ");
				int n = sc.nextInt();
				int n2 = n, sum = 0, d;
				while (n2 > 0) {// sum of cubes of digits
					d = n2 % 10;
					sum += d * d * d;
					n2 /= 10;
				}
				if (sum == n)
					System.out.println("Armstrong.");
				else
					System.out.println("No.");
				break;
			// Perfect
			case 2:
				System.out.println("Enter number: ");
				int a = sc.nextInt();
				int s = 0;
				for (int i = 1; i < a; i++)
					if (a % i == 0)
						s += i; // sum of factors
				if (s == a)
					System.out.println("Perfect.");
				else
					System.out.println("No.");
				break;
			// Prime
			case 3:
				System.out.println("Enter number: ");
				int x = sc.nextInt();
				int c = 0;
				for (int i = 1; i <= x; i++)
					if (x % i == 0)
						c++; // counting factors
				if (c <= 2)
					System.out.println("Prime.");
				else
					System.out.println("No.");
				break;
			// Special
			case 4:
				System.out.println("Enter a number: ");
				int m = sc.nextInt();
				int m2 = m, dig = 0, f = 1, k = 0;
				do { // finds the sum of factorials of digits
					dig = m2 % 10;
					f = 1;
					for (int i = 1; i <= dig; i++)
						f *= i;
					k += f;
					m2 /= 10;
				} while (m2 > 0);
				if (k == m)
					System.out.println("Special.");
				else
					System.out.println("No.");
				break;
			case 5:
				return;
			default:
				System.out.println("Wrong input. Try Again!");
			}
		}
	}
}
