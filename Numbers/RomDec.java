/**
 * Roman numerals to decimal conversion
 */
package Numbers;

import java.util.*;

public class RomDec {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter a valid Roman numeral(0 to exit): ");
			String rom = sc.nextLine().toUpperCase();
			if (rom.equals("0"))
				System.exit(0);
			int i, len = rom.length(), dec = 0;
			for (i = 0; i < len - 1; i++) {
				char ch = rom.charAt(i);
				char ch2 = rom.charAt(i + 1);
				if (f(ch) < f(ch2))
					dec -= f(ch);
				else
					dec += f(ch);
			}
			dec += f(rom.charAt(len - 1));
			System.out.println("Decimal: " + dec);
		}
	}

	static int f(char x) {
		switch (x) {
		case 'M': return 1000;
		case 'D': return 500;
		case 'C': return 100;
		case 'L': return 50;
		case 'X': return 10;
		case 'V': return 5;
		case 'I': return 1;
		default:  return 0;
		}
	}
}
