package com.app.binary_search_tree;

public class BinarySearchTree {

	TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public class TreeNode {
		int data;
		TreeNode leftChild;
		TreeNode rightChild;
	}

	public void insertElement(int num) {

		TreeNode current = root;
		TreeNode previous = null;

		TreeNode node = new TreeNode();
		node.data = num;
		node.leftChild = null;
		node.rightChild = null;

		while (current != null) {
			previous = current;

			if (num < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}

		}

		if (previous == null) {
			root = node;
			return;
		} else if (num < previous.data) {
			previous.leftChild = node;
		} else {
			previous.rightChild = node;
		}

	}

	public boolean find(int num) {
		return find(root, num);
	}

	private boolean find(TreeNode node, int num) {
		
		if(node == null) {
			return false;
		}
		
		if(node.data == num) {
			return true;
		}
		
		if(num > node.data) {
			return find(node.rightChild, num);
		}
		
		if(num < node.data) {
			return find(node.leftChild, num);
		}
		
		return false;
	}
	
	
	
	public void printTree() {
		printTree(root);
	}

	private void printTree(TreeNode node) {

		if (node == null) {
			System.out.println("Empty Tree");
			return;
		}

		if (node.leftChild != null) {
			printTree(node.leftChild);
		}

		System.out.println(node.data);

		if (node.rightChild != null) {
			printTree(node.rightChild);
		}

	}

}
