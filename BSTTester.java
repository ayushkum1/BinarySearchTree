package com.app.binary_search_tree;

public class BSTTester {

	public static void main(String[] args) {
		
		BinarySearchTree bTree = new BinarySearchTree();

		bTree.insertElement(13);
		bTree.insertElement(10);
		bTree.insertElement(16);
		bTree.insertElement(8);
		bTree.insertElement(2);
		bTree.insertElement(20);
		bTree.insertElement(25);
		
		bTree.printTree();
		
		System.out.println("NO exists : " + bTree.find(100));
		System.out.println("NO exists : " + bTree.find(10));
		System.out.println("NO exists : " + bTree.find(02));
		System.out.println("NO exists : " + bTree.find(8));
	}
	
}
