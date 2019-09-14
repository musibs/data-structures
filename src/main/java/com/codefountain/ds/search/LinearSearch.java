package com.codefountain.ds.search;

import java.util.Scanner;

public class LinearSearch {

	private static int[] data = {10,55,43,77,89,9,3,66,51,2,7,99,23};
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the item to be searched:");
		int item = scanner.nextInt();
		scanner.close();
		boolean isFound = false;
		for(int i=0; i<data.length; i++) {
			if(data[i] == item) {
				System.out.println("Item fount at position"+(i+1));
				isFound = true;
				break;
			}
		}
		if(!isFound)System.out.println("Item not found");
		
	}
	
}
