package linkedlist;

public class LinkedListNode {
	private int value;
	private LinkedListNode next, prev;
	
	LinkedListNode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	LinkedListNode getNext() {
		return next;
	}
	
	void setNext(LinkedListNode node) {
		next = node;
	}
	
	LinkedListNode getPrev() {
		return prev;
	}
	
	void setPrev(LinkedListNode node) {
		prev = node;
	}
}
