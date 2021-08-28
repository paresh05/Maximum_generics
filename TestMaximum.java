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
	 * This function is used to find the largest number of float data type */
	public static void maximum(Float[] inputArray)
	{
		float largest=0;
		for(Float element : inputArray) {
			if((element.compareTo(largest))>0)
					largest=element;
		}
		System.out.println("The Largest Number is: "+largest);
	}
	/* Function maximum
	 * This function is used to find the maximum Strings */
	public static void maximum(String[] inputArray)
	{
		String largest=" ";
		for(String element : inputArray) {
			if((element.compareTo(largest))>0)
					largest=element;
		}
		System.out.println("The Largest Number is: "+largest);
	}
	
	
	// Main Function 
	public static void main(String[] args) {
		String[] stringArray = {"Apple","Peach","Banana"};
		maximum(stringArray);
	}
}
