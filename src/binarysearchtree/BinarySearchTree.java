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
	
	public void delete(TreeNode node) {
		if(getLeft(node) == null) {
			if(getRight(node) != null) {
				setParent(getRight(node), getParent(node));
			}
			else {
				replace(node, null);
			}
		}
		else if(getRight(node) == null) {
			setParent(getLeft(node), getParent(node));
			replace(node, null);
		}
		else {
			TreeNode minimum = minimum(getRight(node));

			if(minimum == getRight(node)) {
				setParent(minimum, getParent(node));
				replace(node, minimum);
			}
			else {
				replace(minimum, getRight(minimum));
				setParent(minimum, getParent(node));
			}
			
			setLeft(minimum, getLeft(node));
		}
	}
	
	private void replace(TreeNode node, TreeNode replacement) {
		if(getLeft(getParent(node)) == node) {
			setLeft(getParent(node), replacement);
		}
		else if(getRight(getParent(node)) == node) {
			setRight(getParent(node), replacement);
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
	
	public TreeNode minimum(TreeNode node) {
		TreeNode walker = node;
		
		while(getLeft(walker) != null) {
			walker = getLeft(walker);
		}
		
		return walker;
	}
	
	public TreeNode maximum(TreeNode node) {
		TreeNode walker = node;
		
		while(getRight(walker) != null) {
			walker = getRight(walker);
		}
		
		return walker;
	}
	
	public void inorderWalk(TreeNode node) {
		if(node == null) {
			return;
		}
		else {
			inorderWalk(getLeft(node));
			System.out.println(getValue(node));
			inorderWalk(getRight(node));
		}
	}
	
	public void preorderWalk(TreeNode node) {
		if(node == null) {
			return;
		}
		else {
			System.out.println(getValue(node));
			preorderWalk(getLeft(node));
			preorderWalk(getRight(node));
		}
	}
	
	public void postorderWalk(TreeNode node) {
		if(node == null) {
			return;
		}
		else {
			preorderWalk(getLeft(node));
			preorderWalk(getRight(node));
			System.out.println(getValue(node));
		}
	}
	
	public TreeNode successor(TreeNode node) {
		if(getRight(node) != null){
			return minimum(getRight(node));
		}
		else {
			TreeNode walker = node;
			
			while(getLeft(getParent(walker)) != walker) {
				walker = getParent(walker);
			}
			
			return getParent(walker);
		}
	}
}
