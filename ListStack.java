
/*
 * Demonstrate Stack concept using Linked List
 */
import java.util.*;

public class ListStack {
	// nested class to define linked list node
	private class Node {
		int value;
		Node next;
	}

	Node head = null;
	static Scanner sc = new Scanner(System.in);

	// Add value to the beginning of the list for demonstrating behaviour of stack
	public void push() {
		System.out.println("No. of items to insert: ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			System.out.print("Enter the number to Push : ");
			int value = sc.nextInt();
			Node temp = head;
			head = new Node();
			head.value = value;
			head.next = temp;
			System.out.println("Item Pushed : " + value);
		}
	}

	// Remove value from the beginning of the list for demonstrating behaviour of
	// stack
	public void pop() {
		if (head == null) {
			System.out.println("Stack Underflow! Cannot Remove item!");
			return;
		}
		int value = head.value;
		head = head.next;
		System.out.println("Item Popped up : " + value);
	}

	public void display() {
		Node temp = head;
		if (temp == null) {
			System.out.println("Stack Empty!");
			return;
		}
		System.out.println("\nItems in the Stack : ");
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		ListStack S = new ListStack();
		while (true) {
			System.out.println("\n1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				S.push();
				break;

			case 2:
				S.pop();
				break;

			case 3:
				S.display();
				break;

			case 4:
				return;

			default:
				System.out.println("\nWrong Choice! Try Again!");
			}
		}
	}
}
