package io.codefountain.ds.tree.datastructures.main;

import io.codefountain.ds.tree.datastructures.BinarySearchTree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree(15);
		bst.insertNode(10);
		bst.insertNode(8);
		bst.insertNode(12);
		bst.insertNode(20);
		bst.insertNode(17);
		bst.insertNode(25);
		bst.insertNode(19);
		
		
		System.out.println(bst.findNode(15));
		System.out.println(bst.findNode(10));
		System.out.println(bst.findNode(8));
		System.out.println(bst.findNode(12));
		System.out.println(bst.findNode(20));
		System.out.println(bst.findNode(17));
		System.out.println(bst.findNode(25));
		System.out.println(bst.findNode(19));
		
		System.out.println(bst.findNode(0));
	}

}
