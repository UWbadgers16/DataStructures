package binarytree;

public class TreeNode {
	private int value;
	private TreeNode parent, left, right;
	
	TreeNode(int value) {
		this.value = value;
	}
	
	void setLeft(TreeNode left) {
		this.left = left;
	}
	
	TreeNode getParent() {
		return parent;
	}
	
	void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	TreeNode getLeft() {
		return left;
	}
	
	void setRight(TreeNode right) {
		this.right = right;
	}
	
	TreeNode getRight() {
		return right;
	}
	
	int getValue() {
		return value;
	}
}
