package io.codefountain.ds.tree.datastructures;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BinaryTree {
	
	private int value;
	
	private BinaryTree leftChild;
	private BinaryTree rightChild;
	
	public BinaryTree(int value) {
		this.value = value;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	
	@Override
	public String toString() {
		return "[ "+value+" ]";
	}
	public void insertLeft(int value) {
		if(this.leftChild == null) {
			this.leftChild = new BinaryTree(value);
		}
		else {
			BinaryTree newChildNode = new BinaryTree(value);
			newChildNode.leftChild = this.leftChild;
			this.leftChild = newChildNode;
		}
	}
	
	public void insertRight(int value) {
		if(this.rightChild == null) {
			this.rightChild = new BinaryTree(value);
		}
		else {
			BinaryTree newChildNode = new BinaryTree(value);
			newChildNode.rightChild = this.rightChild;
			this.rightChild = newChildNode;
		}
	}

	public void preOrderTraversal() {
		
		System.out.print(this.value+", ");
		
		if(this.leftChild != null) {
			this.leftChild.preOrderTraversal();
		}
		
		if(this.rightChild != null) {
			this.rightChild.preOrderTraversal();
		}
	}
	
	public void inOrderTraversal() {
		
		if(this.leftChild != null) {
			this.leftChild.inOrderTraversal();
		}
		
		System.out.print(this.value +", ");
		
		if(this.rightChild != null) {
			this.rightChild.inOrderTraversal();
		}
	}
	
	public void postOrderTraversal() {
		if(this.leftChild != null) {
			this.leftChild.postOrderTraversal();
		}
		
		if(this.rightChild != null) {
			this.rightChild.postOrderTraversal();
		}
		
		System.out.print(this.value+", ");
	}
	
	public void breadthFirstSearch() {
		Queue<BinaryTree> queue = new LinkedBlockingQueue<>();
		queue.add(this);
		
		while(!queue.isEmpty()) {
			
			BinaryTree tempNode = queue.poll();
			System.out.print(tempNode != null ? tempNode.value+", " : "");
			
			
			if(tempNode.leftChild != null) {
				queue.add(tempNode.leftChild);
			}
			
			if(tempNode.rightChild != null) {
				queue.add(tempNode.rightChild);
			}
			
		}
	}
}
