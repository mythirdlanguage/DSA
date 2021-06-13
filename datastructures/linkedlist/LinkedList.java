package linkedlist;

public class LinkedList {
	Node head;

	public void add(Object obj) {
		Node newNode = new Node(obj, head);
		head = newNode;
	}

	public void remove(Object obj) {
		Node temp = head, prev;
		if (temp == null)
			return;
		if (temp.obj == obj) {
			head = temp.next;
			return;
		}
		prev = temp;
		temp = temp.next;
		while (temp != null) {
			if (temp.obj == obj) {
				prev.next = temp.next;
			} else {
				prev = temp;
			}
			temp = temp.next;
		}
	}

	public void removeAll() {
		head = null;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.obj);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println("Elements of list");
		list.print();
		list.remove(1);
		System.out.println("After removing 1");
		list.print();
		list.remove(3);
		System.out.println("After removing 3");
		list.print();
		list.remove(4);
		System.out.println("After removing 4");
		list.print();
		list.remove(55);
		System.out.println("After removing 55");
		list.print();
		list.removeAll();
		System.out.println("After removing all");
		list.print();
	}
}

class Node {
	Object obj;
	Node next;

	public Node(Object obj, Node next) {
		this.obj = obj;
		this.next = next;
	}
}
