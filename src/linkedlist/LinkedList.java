package linkedlist;

public class LinkedList {
	private LinkedListNode head, tail;
	private int count = 0;

	public LinkedList() {
		count = 0;
	}
	
	public LinkedList(int value) {
		head = new LinkedListNode(value);
		tail = head;
		count = 1;
	}
	
	public void insert(int value) {
		LinkedListNode insert = new LinkedListNode(value);
		
		if(head == null) {
			head = insert;
			tail = insert;
		}
		else {
			insert.setPrev(tail);
			tail.setNext(insert);
			tail = insert;
		}
		
		count++;
	}
	
	public void delete(LinkedListNode node) {
		if(head == node) {
			head = head.getNext();
			
			if(head != null ) {
				head.setPrev(node.getPrev());
			}
			else {
				tail = head;
			}
			count--;
		}
		else if(tail == node) {
			tail = tail.getPrev();
			tail.setNext(node.getNext());
			count--;
		}
		else {
			node.getPrev().setNext(node.getNext());
			node.getNext().setPrev(node.getPrev());
			count--;
		}
	}
	
	public LinkedListNode search(int value) {
		LinkedListNode walker = head;
		
		while(walker != null) {
			if(walker.getValue() == value) {
				return walker;
			}
			
			walker = walker.getNext();
		}
		
		return null;
	}
	
	public LinkedListNode getHead() {
		return head;
	}
	
	public LinkedListNode getTail() {
		return tail;
	}
	
	public int getSize() {
		return count;
	}

	public void printLinkedList() {
		System.out.println("Size: " + count);
		
		LinkedListNode walker = head;
		
		while(walker != null) {
			System.out.print(walker.getValue() + " ");
			walker = walker.getNext();
		}
		System.out.println();
	}
}
