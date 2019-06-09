/**
 * Combine two arrays and sort
 */
import java.util.*;

public class Combine {
	int com[], size, i = 0, j = 0, min = 0, p = 0;
	static Scanner sc = new Scanner(System.in);

	public Combine(int nn) {
		size = nn;
		com = new int[size];
	}

	void inputArray() {
		System.out.println("Enter array elements: ");
		for (i = 0; i < size; i++)
			com[i] = sc.nextInt();
	}

	void sort() {
		for (i = 0; i < size - 1; i++) {
			min = com[i];
			p = i;
			for (j = i; j < size; j++) {
				if (com[j] < min) {
					min = com[j];
					p = j;
				}
			}
			int k = com[i];
			com[i] = com[p];
			com[p] = k;
		}
	}

	void mix(Combine A, Combine B) {
		int k = 0;
		size = A.size + B.size;
		for (i = 0; i < A.size; i++)
			com[i] = A.com[i];
		for (i = A.size; i < size; i++)
			com[i] = B.com[k++];
	}

	void display() {
		System.out.println("Sorted and merged array: ");
		for (i = 0; i < size; i++)
			System.out.print(com[i] + " ");
	}

	public static void main(String[] args) {
		System.out.println("Enter sizes of 1st and 2nd array: ");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		Combine X = new Combine(s1);
		Combine Y = new Combine(s2);
		Combine Z = new Combine(s1 + s2);
		X.inputArray();
		Y.inputArray();
		Z.mix(X, Y);
		Z.sort();
		Z.display();
	}
}
