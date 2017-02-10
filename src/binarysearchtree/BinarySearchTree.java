package binarysearchtree;

import java.util.NoSuchElementException;
import binarytree.BinaryTree;
import binarytree.TreeNode;

public class BinarySearchTree extends BinaryTree {
	
	public BinarySearchTree(int value) {
		super(value);
	}
	
	public void insert(int value) {
		TreeNode walker = binaryTree;
		TreeNode parent = null; 
		
		while(walker != null) {
			parent = walker;
			
			if(value < getValue(walker)) {
				walker = getLeft(walker);
			}
			else if(value > getValue(walker)) {
				walker = getRight(walker);
			}
			else if(value == getValue(walker)){
				return;
			}
		}

		if(value < getValue(parent)) {
			addLeft(parent, value);
		}
		else if(value > getValue(parent)) {
			addRight(parent, value);
		}
	}
	
	public TreeNode search(TreeNode root, int value) {
		TreeNode foundNode = null;
		
		if(root == null) {
			throw new NoSuchElementException();
		}
		
		if(getValue(root) == value) {
			foundNode = root;
		}
		else {
			if(value < getValue(root)) {
				foundNode = search(getLeft(root), value);
			}
			else if(value > getValue(root)) {
				foundNode = search(getRight(root), value);
			}
		}

		return foundNode;
	}
	
	public int minimum() {
		TreeNode walker = binaryTree;
		
		while(getLeft(walker) != null) {
			walker = getLeft(walker);
		}
		
		return getValue(walker);
	}
	
	public int maximum() {
		TreeNode walker = binaryTree;
		
		while(getRight(walker) != null) {
			walker = getRight(walker);
		}
		
		return getValue(walker);
	}
}
