package com.codefountain.ds.trees.bt;

public class Node {
	
	private int data;
	private Node leftChild, rightChild;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insertLeft(int data) {
		if(leftChild == null) {
			leftChild = new Node(data);
		}
		else {
			leftChild.insertLeft(data);
		}
	}
	
	public void insertRight(int data) {
		if(rightChild == null) {
			rightChild = new Node(data);
		}
		else {
			rightChild.insertRight(data);
		}
	}

}
