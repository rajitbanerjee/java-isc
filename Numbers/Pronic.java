/*
 * Pronic number: number which is the product of 2 consecutive integers
 * Program to check pronic number
 */
import java.util.*;

public class Pronic {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int i;
		for (i = 0; i <= a / 2; i++) {
			if (i * (i + 1) == a) {
				System.out.println("Pronic");
				break;
			}
		}
	}
}