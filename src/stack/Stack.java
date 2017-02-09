package stack;

import java.util.EmptyStackException;
import linkedlist.LinkedList;

public class Stack {
	private LinkedList stack;
	
	public Stack() {
		stack = new LinkedList();
	}
	
	public Stack(int value) {
		stack = new LinkedList(value);
	}
	
	public void push (int value) {
		stack.insert(value);
	}
	
	public int pop() {
		int returnValue = -1;
		
		if(!empty()) {
			returnValue = stack.getTail().getValue();
			stack.delete(stack.getTail());
		}
		else {
			throw new EmptyStackException();
		}

		return returnValue;
	}
	
	public boolean empty() {
		if(stack.getSize() > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void printStack() {
		stack.printLinkedList();
	}
}
