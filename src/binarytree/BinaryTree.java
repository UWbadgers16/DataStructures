package binarytree;

public class BinaryTree {
	protected TreeNode binaryTree = null;
	private int count = 0;
	
	public BinaryTree(int value) {
		binaryTree = new TreeNode(value);
		count++;
	}
	
	public TreeNode getRoot() {
		return binaryTree;
	}
	
	public void addLeft(TreeNode parent, int value) {
		parent.setLeft(new TreeNode(value));
		parent.getLeft().setParent(parent);
		count++;
	}
	
	public void addRight(TreeNode parent, int value) {
		parent.setRight(new TreeNode(value));
		parent.getRight().setParent(parent);
		count++;
	}
	
	public TreeNode getParent(TreeNode node) {
		return node.getParent();
	}
	
	public TreeNode getLeft(TreeNode node) {
		return node.getLeft();
	}
	
	public TreeNode getRight(TreeNode node) {
		return node.getRight();
	}
	
	public int getValue(TreeNode node) {
		return node.getValue();
	}
	
	public int getSize() {
		return count;
	}
	
	public void printBinaryTree(TreeNode root, int indent) {
		for(int i = 0; i < indent * 4; i++) {
			if(i < (indent * 4) - 4) {
				System.out.print(" ");
			}
			else if(i == (indent * 4) - 4) {
				System.out.print("|");
			}
			else {
				System.out.print("-");
			}
		}
		
		if(root == null) {
			System.out.println();
			return;
		}
		
		System.out.println(root.getValue());
		
		printBinaryTree(root.getLeft(), indent + 1);
		printBinaryTree(root.getRight(), indent + 1);
	}
}
