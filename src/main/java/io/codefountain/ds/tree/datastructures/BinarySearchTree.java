package io.codefountain.ds.tree.datastructures;

import lombok.Data;

@Data
public class BinarySearchTree {

	private int value;
	private BinarySearchTree leftChild;
	private BinarySearchTree rightChild;
	
	public BinarySearchTree(int value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public void insertNode(int value) {
		
		if(value <= this.value && this.leftChild != null) {
			this.leftChild.insertNode(value);
		}
		else if(value <= this.value) {
			this.leftChild = new BinarySearchTree(value);
		}
		else if(value >= this.value && this.rightChild != null) {
			this.rightChild.insertNode(value);
		}
		else {
			this.rightChild = new BinarySearchTree(value);
		}
		
	}
	
	public boolean findNode(int value) {
		
		if(value < this.value && this.leftChild != null) {
			return this.leftChild.findNode(value);
		}
		if(value > this.value && this.rightChild != null) {
			return this.rightChild.findNode(value);
		}
		
		return this.value == value;
	}
}
