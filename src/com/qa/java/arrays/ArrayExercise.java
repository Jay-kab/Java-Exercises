package com.qa.java.arrays;

public class ArrayExercise {

	public static void main(String[] args) {
		
	
	
		
		
		
		int[] nos = {1, 6, 2, 8, 3, 9, 15, 0};
	
		
		
		ArrayUtil arraySum = new ArrayUtil();
		int sum = arraySum.getSumOfArrayElement(nos);
		System.out.println("Sum of array is : " + sum);
		

		int smallNumber = arraySum.getSmallestArrayElement(nos);
		System.out.println("The smallest numer in array is : " + smallNumber);
		
		
		int largeNumber = arraySum.getLargestArrayElement(nos);
		System.out.println("The largest number in array is : " + largeNumber);
	
		
		int countEvenNumbers = arraySum.getEvenArrayElementCount(nos);
		System.out.println("Number of even number in array is : " + countEvenNumbers);
		
		
		
		
	}

	
	
				
	
	

}
