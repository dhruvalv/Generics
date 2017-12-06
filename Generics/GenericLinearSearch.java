package com.dhruval.generics;

/**
 * @author Dhruval Variya. Email : dhruvalv@gmail.com
 * 
 *         Find the element in array.
 */
public class GenericLinearSearch<E> {
	public static void main(String args[]) {
		Integer list[] = { 11, 2, 5, 69, 70 };
		
		int index = linearSearch(list, 85);
		System.out.println(
				index >= 0 ? "Key is Present in the list at index: " + index : "Key is not present in the list");
	}

	
	// This method supports Any type of list e.g. Integer, Double, String.
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		int n = list.length;
		for (int i = 0; i < n; i++) {
			if (list[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}
}
