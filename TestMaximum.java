package com.bridgelabzd16;

public class TestMaximum {
	/* Function maximum
	 * This function is used to find the largest number */
	public static void maximum(Integer[] inputArray)
	{
		int largest=0;
		for(Integer element : inputArray) {
			if((element.compareTo(largest))>0)
					largest=element;
		}
		System.out.println("The Largest Number is: "+largest);
	}
	// Main Function
	public static void main(String[] args) {
		Integer[] intArray = {158,298,5500};
		maximum(intArray);
	}
}
