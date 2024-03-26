package DataStructureImpl;

class Node1 {

	int data;
	Node1 prev;
	Node1 next;

	public Node1(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

public class DoublyLinkedList {

	Node1 head;
	Node1 tail;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addFirst(int data) {

		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}

	}

	public void addLast(int data) {

		Node1 newNode = new Node1(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addMiddle(int position, int data) {
		if (position <= 0) {
			addFirst(data); // Add at the beginning if position is less than or equal to 0
		} else {
			Node1 newNode = new Node1(data);
			Node1 current = head;
			for (int i = 1; i < position && current != null; i++) {
				current = current.next;
			}
			if (current == null || current.next == null) {
				addLast(data); // Add at the end if position exceeds the list size
			} else {
				newNode.next = current.next;
				newNode.prev = current;
				current.next.prev = newNode;
				current.next = newNode;
			}
		}
	}

	public void removeFirst() {
		if (head == null) {
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
		}
	}

	public void removeLast() {
		if (tail == null) {
			return;
		}
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void removeMiddle(int position) {
		if (position <= 0 || head == null) {
			removeFirst();
		} else {
			Node1 current = head;
			for (int i = 1; i < position && current != null; i++) {
				current = current.next;
			}
			if (current == null || current.next == null) {
				removeLast();
			} else {
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}
		}
	}

	public void display() {
		Node1 current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.addFirst(3);
		dll.addFirst(2);
		dll.addFirst(1);
		dll.addMiddle(3,4);
		dll.addMiddle(4, 5);
		dll.addLast(6);
		dll.addLast(7);
		
		System.out.println("Doubly linked list elements:");
		dll.display();
		
		dll.removeFirst();
		dll.removeMiddle(3);
		dll.removeLast();
		
		System.out.println("Doubly linked list elements after removal:");
		dll.display();
	}

}
