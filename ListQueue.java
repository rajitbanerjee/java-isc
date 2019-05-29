/*
 * Demonstrate Queue concept using Linked List
 */
import java.util.*;

class ListQueue {
	class Node {
		int val;
		Node next;
	}

	Node first, last;
	static Scanner sc = new Scanner(System.in);

	public void enqueue() {
		System.out.print("Enter the number to Enqueue : ");
		int num = sc.nextInt();
		Node temp = new Node();
		temp.val = num;
		if (first == null)
			first = temp;
		else
			last.next = temp;
		last = temp;
	}

	public void dequeue() {
		if (first == null) {
			System.out.println("Queue Underflow!");
			return;
		}
		System.out.println("Item removed: " + first.val);
		first = first.next;
	}

	public void display() {
		Node temp = first;
		if (temp == null) {
			System.out.println("Queue Empty!");
			return;
		}
		System.out.println("\nItems in the Queue : ");
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		ListQueue S = new ListQueue();
		while (true) {
			System.out.println("\n1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			System.out.print("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				S.enqueue();
				break;

			case 2:
				S.dequeue();
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
