package com.nt.bst;

import org.junit.Test;

public class BSTClientTest {
	public static void main(String[] args) {

	}

	@Test
	public void bstTest() {

		BST bst = new BST();

		bst.insert(50);
		bst.insert(25);
		bst.insert(75);
		bst.insert(10);
		bst.insert(30);
		bst.insert(60);
		bst.insert(65);
		bst.insert(80);
		bst.insert(85);
		bst.insert(1);
		bst.insert(109);

		Node r = bst.root;
		System.out.println("Root Node of BST :: " + r.data);
		int size = bst.size(r);
		System.out.println("Size of BST :: " + size);
		
		int height=bst.maxDepthRecurssive(r);
		System.out.println("Height Or Depth of BST ::"+height);
	}// end of bstTest() method

}// end of BSTClientTest class
