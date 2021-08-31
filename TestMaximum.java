package com.bridgelabzd16;

public class TestMaximum<E extends Comparable<E>> {

	E[] inputArray;

	// Parameterized constructor
	public TestMaximum(E[] inputArray) {
		this.inputArray = inputArray;
	}

	// The function maximum returns the maximum of the inputArray
	public E maximum() {
		return TestMaximum.maximum(inputArray);
	}

	/*
	 * Method maximum 
	 * This Generic method is used to find the maximum
	 */
	public static <E extends Comparable<E>> E maximum(E[] inputArray) {
		E maximum = inputArray[0];
		for (E element : inputArray) {
			if ((element.compareTo(maximum)) > 0)
				maximum = element;
		}
		printMax(maximum);
		return maximum;
	}

	// This function prints the maximum
	public static <E> void printMax(E maximum) {
		System.out.println("The Maximum is: " + maximum);
	}

	// Main Function

	public static void main(String[] args) {

		String[] stringArray = { "Apple", "Peach", "Banana", "Orange" };
		Integer[] intArray = { 778, 52, 45, 587, 1008, 998, 1126 };
		Float[] floatArray = { 52.5f, 53.2f, 56.4f };
		TestMaximum obj = new TestMaximum(stringArray);
		obj.maximum();
		TestMaximum obj2 = new TestMaximum(intArray);
		obj2.maximum();
		TestMaximum obj3 = new TestMaximum(floatArray);
		obj3.maximum();
	}
}
