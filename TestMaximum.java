package com.bridgelabzd16;

public class TestMaximum {
	/* Method maximum
	 * This Generic method is used to find the maximum */
	public static <E extends Comparable<E>> void maximum(E[] inputArray)
	{
		E maximum = inputArray[0];
		for(E element : inputArray) {
			if((element.compareTo(maximum))>0)
					maximum=element;
		}
		System.out.println("The Maximum is: "+maximum);
	}
	
	// Main Function 
	public static void main(String[] args) {
		String[] stringArray = {"Apple","Peach","Banana"};
		Integer[] intArray = {778,52,45};
		Float[] floatArray= {52.5f,53.2f,56.4f};
		maximum(stringArray);
		maximum(intArray);
		maximum(floatArray);
	}
}
