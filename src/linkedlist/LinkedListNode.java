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
	
	public LinkedListNode getNext() {
		return next;
	}
	
	public void setNext(LinkedListNode node) {
		next = node;
	}
	
	public LinkedListNode getPrev() {
		return prev;
	}
	
	public void setPrev(LinkedListNode node) {
		prev = node;
	}
}
