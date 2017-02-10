package datastructurestest;

import linkedlist.LinkedList;
import queue.Queue;
import stack.Stack;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Random;

import binarysearchtree.BinarySearchTree;
import binarytree.BinaryTree;
import binarytree.TreeNode;

public class DataStructuresTest {

	public static void main(String[] args) {
		
		/* Testing LinkedList data structure */
//		testLinkedList();
		
		/* Testing Stack data structure */
//		testStack();
		
		/* Testing Queue data structure */
//		testQueue();
		
//		/* Testing BinaryTree data structure */
//		testBinaryTree();

		/* Testing BinarySearchTree data structure */
		testBinarySearchTree();
	}
	
	private static void testLinkedList() {
		System.out.println("TESTING LINKED LIST");
		LinkedList linkedList = new LinkedList();

		for(int i = 0; i < 2; i++) {
			linkedList.insert(i);
		}
		
		linkedList.printLinkedList();

		linkedList.delete(linkedList.search(1));
		linkedList.printLinkedList();
	}
	
	private static void testStack() {
		System.out.println("TESTING STACK");
		Stack stack = new Stack();

		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}

		stack.printStack();
		
		try {
			for(int i = 0; i < 11; i++) {
				System.out.println("Removing " + stack.pop());
			}
		}catch(EmptyStackException ex) {
			System.out.println("Stack is empty");
		}
		
		stack.printStack();
	}
	
	private static void testQueue() {
		System.out.println("TESTING QUEUE");
		Queue queue = new Queue();

		for(int i = 0; i < 10; i++) {
			queue.enqueue(i);
		}

		queue.printQueue();
		
		try {
			for(int i = 0; i < 11; i++) {
				System.out.println("Removing " + queue.dequeue());
			}
		}catch(NoSuchElementException ex) {
			System.out.println("Queue is empty");
		}
		
		queue.printQueue();
	}
	
	private static void testBinaryTree() {
		System.out.println("TESTING BINARY TREE");
		BinaryTree binaryTree = new BinaryTree(0);

		binaryTree.addLeft(binaryTree.getRoot(), 1);
		binaryTree.addRight(binaryTree.getRoot(), 2);
		binaryTree.addLeft(binaryTree.getLeft(binaryTree.getRoot()), 4);
		binaryTree.addRight(binaryTree.getLeft(binaryTree.getRoot()), 5);

		System.out.println("Size: " + binaryTree.getSize());
		binaryTree.printBinaryTree(binaryTree.getRoot(), 0);
	}
	
	private static void testBinarySearchTree() {
		System.out.println("TESTING BINARY SEARCH TREE");
		BinarySearchTree binarySearchTree = new BinarySearchTree(19);
		binarySearchTree.insert(45);
		binarySearchTree.insert(87);
		binarySearchTree.insert(11);
		binarySearchTree.insert(33);
		
		System.out.println("Size: " + binarySearchTree.getSize());
		binarySearchTree.printBinaryTree(binarySearchTree.getRoot(), 0);
		
		try {
			System.out.println("Found: " + binarySearchTree.getValue(binarySearchTree.search(binarySearchTree.getRoot(), 33)));
		}catch(NoSuchElementException ex) {
			System.out.println("Element not in tree");
		}
		
		System.out.println("Minimum: " + binarySearchTree.minimum());
		System.out.println("Maximum: " + binarySearchTree.maximum());
	}
}
