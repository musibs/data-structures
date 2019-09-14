package com.codefountain.ds.trees.bst;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Node {
	
	private int data;
	private Node left, right;
	
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int newData) {
		
		if(newData <= data) {
			if(left == null) {
				left = new Node(newData);
			}
			else {
				left.insert(newData);
			}
		}
		else {
			if(right == null) {
				right = new Node(newData);
			}
			else {
				right.insert(newData);
			}
		}
	}
	
	public boolean contains(int value) {
		if(data == value) {
			return true; 
		}
		
		else if(value < data) {
			if(left == null) {
				return false;
			}
			else {
				return left.contains(value);
			}
			
		}else {
			if(right == null) {
				return false;
			}else {
				return right.contains(value);
			}
		}
	}

	
	public void preOrderTraversal() {
		System.out.println(data);
		
		if(left != null) {
			left.preOrderTraversal();
		}
		
		if(right != null) {
			right.preOrderTraversal();
		}
	}
	
	public void inorderTraversal() {
		if(left != null) {
			left.inorderTraversal();
		}
		
		System.out.println(data);
		
		if(right != null) {
			right.inorderTraversal();
		}
	}
	
	public void postOrderTraversal() {
		if(left != null) {
			left.postOrderTraversal();
		}
		
		if(right != null) {
			right.postOrderTraversal();
		}
		
		System.out.println(data);
	}
	
	public void breadthFirstSearch() {
		Queue<Node> queue = new ConcurrentLinkedQueue<>();
		
		queue.add(this);
		
		while(!queue.isEmpty()) {
			
			Node headNode = queue.poll();
			if(headNode.left != null) {
				queue.add(headNode.left);
			}
			
			if(headNode.right != null) {
				queue.add(headNode.right);
			}
			
			System.out.println(headNode.data);			
		}
	}
	
	public void depthFirstSearch() {
		System.out.println(this.data);
		
		if(left != null) {
			left.depthFirstSearch();
		}
		
		if(right != null) {
			right.depthFirstSearch();
		}
	}
}
