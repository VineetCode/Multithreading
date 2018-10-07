package com.nt.bst;

public class BST {

	public Node root;

	public void insert(int data) {
		if (root == null)
			root = new Node(data);
		else
			insertHelper(root, data);
	}// end of insert(-,-) method

	private void insertHelper(Node root, int data) {

		if (data > root.data) {
			if (root.rightChild == null)
				root.rightChild = new Node(data);
			else
				insertHelper(root.rightChild, data);

		} else {
			if (root.leftChild == null)
				root.leftChild = new Node(data);
			else
				insertHelper(root.leftChild, data);
		}
	}// end of insertHelper(-,-) method

	public int size(Node root) {
		if (root == null)
			return 0;
		int leftCount = root.leftChild == null ? 0 : size(root.leftChild);
		int rightCount = root.rightChild == null ? 0 : size(root.rightChild);
		return 1 + leftCount + rightCount;
	}// end of size(-) method

	public int maxDepthRecurssive(Node root) {
		if (root == null)
			return 0;
		int leftDepth = maxDepthRecurssive(root.leftChild);
		int rightDepth = maxDepthRecurssive(root.rightChild);

		return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
	}// end of maxDepthRecurssive(-) method 
	
}// end of BST class
