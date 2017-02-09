package queue;

import java.util.NoSuchElementException;
import linkedlist.LinkedList;

public class Queue {
	private LinkedList queue;
	
	public Queue() {
		queue = new LinkedList();	
	}
	
	public Queue(int value) {
		queue = new LinkedList(value);	
	}
	
	public void enqueue(int value) {
		queue.insert(value);
	}
	
	public int dequeue() {
		int returnValue = -1;
		
		if(!empty()) {
			returnValue = queue.getHead().getValue();
			queue.delete(queue.getHead());
		}
		else {
			throw new NoSuchElementException();
		}
		
		return returnValue;
	}

	public boolean empty() {
		if(queue.getSize() > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void printQueue() {
		queue.printLinkedList();
	}
}
