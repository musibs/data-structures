package com.codefountain.ds.search;

import java.util.Scanner;

public class BinarySearch {
	
	private static int[] data = {11,22,33,44,55};

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the item to be searched:");
		int item = scanner.nextInt();
		scanner.close();
		boolean isFound = false;
		int low = 0;
		int high = data.length;
		
		
		
		while(low<high) {
			int mid = (low+high)/2;
			
			if(data[mid] == item) {
				isFound = true;
				break;
			}
			else if(item < data[mid]) {
				high = mid -1 ;
			}
			else {
				low = mid + 1;
			}
			
		}
		
		if(isFound) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	
	
	
}
