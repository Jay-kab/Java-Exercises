package com.qa.java.arrays;

public class ArrayUtil {

	int getSumOfArrayElement(int[] nos) {
		
		
		//int[] nos1 = {1, 6, 2, 8, 3, 9, 15, 0};
		
		int sum = 0;
		
		
		for (int no : nos) {
			sum += no;
		}
		return sum;
			
			
		}
		
	

		int getSmallestArrayElement(int[] nos) {
			
			int smallNumber = nos [0];
			
			for (int no : nos) {
				if (no<smallNumber) {
					smallNumber = no;
				}
			}
		
			return smallNumber;
			
		}
		
		
	int getLargestArrayElement(int[] nos) {
			
			int largeNumber = nos [0];
			
			for (int no : nos) {
				if (no > largeNumber) {
					largeNumber = no;
				}
			}
		
			return largeNumber;
		
}
	
	int getEvenArrayElementCount(int[] nos) {
		
		int countNumber = 0;
		
		for (int no : nos) {
			if (no %2 == 0)
				
				countNumber ++;
			
		}
		return countNumber;
		
	}
}