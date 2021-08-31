package com.bridgelabzd16;

public class TestMaximum<E extends Comparable<E>> {
	
	E[] inputArray;
	public TestMaximum(E[] inputArray) {
		this.inputArray=inputArray;
	}
	
	public E maximum() {
		return TestMaximum.maximum(inputArray);
	}
	/* Method maximum
	 * This Generic method is used to find the maximum */
	public static <E extends Comparable<E>>E maximum(E[] inputArray)
	{
		E maximum = inputArray[0];
		for(E element : inputArray) {
			if((element.compareTo(maximum))>0)
					maximum=element;
		}
		System.out.println("The Maximum is: "+maximum);
		return maximum;
	}
	
	// Main Function 
	public static void main(String[] args) {
		String[] stringArray = {"Apple","Peach","Banana"};
		Integer[] intArray = {778,52,45};
		Float[] floatArray= {52.5f,53.2f,56.4f};
		TestMaximum obj = new TestMaximum(stringArray);
		obj.maximum();
		TestMaximum obj2 = new TestMaximum(intArray);
		obj2.maximum();
		TestMaximum obj3 = new TestMaximum(floatArray);
		obj3.maximum();
	}
}
