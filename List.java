
/*
 * Implement a simple Linked list
 */
import java.util.*;

public class List {
	class Node {
		int val;
		Node next;
	}

	Node head = null;
	static Scanner sc = new Scanner(System.in);

	public void insertFirst() {
		System.out.print("Enter the number to insert at first : ");
		int num = sc.nextInt();
		Node temp = new Node();
		temp.val = num;
		if (head == null)
			temp.next = null;
		else
			temp.next = head;
		head = temp;
	}

	public void insertLast() {
		System.out.print("Enter the number to insert at last : ");
		int num = sc.nextInt();
		Node t = head, temp = new Node();
		temp.val = num;
		temp.next = null;
		if (head == null)
			head = temp;
		else {
			while (t.next != null)
				t = t.next;
			t.next = temp;
		}
	}

	public void removeFirst() {
		if (head == null) {
			System.out.println("Linked List is Empty!");
			return;
		}
		System.out.println("Item Removed : " + head.val);
		head = head.next;
		System.out.println("Item Removed : " + head.val);
		head = head.next;
	}

	public void delete() {
		if (head == null) {
			System.out.println("Linked List is Empty!");
			return;
		}
		System.out.print("Enter a number to delete: ");
		int n = sc.nextInt(), c = 0;
		Node temp = head, p;
		p = temp;
		temp = temp.next;
		while (temp != null) {
			c++;
			if (c == n) {
				p.next = temp.next;
				break;
			}
			p = temp;
			temp = temp.next;
		}
	}

	public void display() {
		Node temp = head;
		int sum = 0, count = 0;
		if (temp == null) {
			System.out.println("Linked List is Empty!");
			return;
		}
		System.out.println("\nItems in the List : ");
		while (temp != null) {
			System.out.print(temp.val + " ");
			sum += temp.val;
			count++;
			temp = temp.next;
		}
		if (count != 0) {
			System.out.println("\nNo. of Nodes : " + count);
			System.out.println("Sum of Nodes : " + sum);
		}
	}

	public static void main(String args[]) {
		List L = new List();
		while (true) {
			System.out.println("\n1. Insert First");
			System.out.println("2. Insert Last");
			System.out.println("3. Remove First");
			System.out.println("4. Delete");
			System.out.println("5. Display List");
			System.out.println("6. Exit");
			System.out.print("Enter your choice : ");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				L.insertFirst();
				break;

			case 2:
				L.insertLast();
				break;

			case 3:
				L.removeFirst();
				break;

			case 4:
				L.delete();
				break;

			case 5:
				L.display();
				break;

			case 6:
				return;

			default:
				System.out.println("\nWrong Choice! Try Again!");
			}
		}
	}
}
