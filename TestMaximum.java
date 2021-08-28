package com.bridgelabzd16;

public class TestMaximum {
	/* Function maximum
	 * This function is used to find the largest number of integer data type */
	public static void maximum(Integer[] inputArray)
	{
		int largest=0;
		for(Integer element : inputArray) {
			if((element.compareTo(largest))>0)
					largest=element;
		}
		System.out.println("The Largest Number is: "+largest);
	}
	/* Function maximum
	 * This function is used to find the largest number of double. data type */
	public static void maximum(Float[] inputArray)
	{
		float largest=0;
		for(Float element : inputArray) {
			if((element.compareTo(largest))>0)
					largest=element;
		}
		System.out.println("The Largest Number is: "+largest);
	}
	
	// Main Function 
	public static void main(String[] args) {
		Float[] floatArray = {158.5f,550.5f,550.51f};
		maximum(floatArray);
	}
}
