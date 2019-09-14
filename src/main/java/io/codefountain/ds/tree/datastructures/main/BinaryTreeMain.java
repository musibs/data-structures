package io.codefountain.ds.tree.datastructures.main;

import io.codefountain.ds.tree.datastructures.BinaryTree;

public class BinaryTreeMain {
	
	public static void main(String[] args) {
		
		
		BinaryTree rootNode = new BinaryTree(1);
		rootNode.setLeftChild(new BinaryTree(2));
		rootNode.setRightChild(new BinaryTree(5));
		
		BinaryTree node2 = rootNode.getLeftChild();
		BinaryTree node5 = rootNode.getRightChild();
		
		node2.setLeftChild(new BinaryTree(3));
		node2.setRightChild(new BinaryTree(4));
		
		node5.setLeftChild(new BinaryTree(6));
		node5.setRightChild(new BinaryTree(7));
		
		System.out.println("Pre-Order Traversal");
		rootNode.preOrderTraversal();

		System.out.println("\nIn-Order Traversal");
		rootNode.inOrderTraversal();
		
		System.out.println("\nPost-Order Traversal");
		rootNode.postOrderTraversal();
		
		System.out.println("\nBreadth first traversal");
		rootNode.breadthFirstSearch();
		
	}

}
