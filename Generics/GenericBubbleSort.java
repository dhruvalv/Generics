/**
 * 
 */
package com.dhruval.generics;
/**
 * @author Dhruval Variya. Email : dhruvalv@gmail.com
 *
 */
public class GenericBubbleSort {
	public static void main(String[] args) {
		Integer[] iArr = new Integer[] { 6, 2, 1, 3, 14, 5, 0 };
		Double[] dArr = new Double[] { 1.6, 9.2, 3.2, 5.3, 1.4 };
		String[] sArr = new String[] { "AB", "BB", "AC", "AD", "CE" };
		
		System.out.println("Generic Bubble Sort");
		System.out.print("Sorted Integers : ");
		bubbleSort(iArr);
		for (Integer i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Doubles : ");
		bubbleSort(dArr);
		for (Double i : dArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Strings : ");
		bubbleSort(sArr);
		for (String i : sArr) {
			System.out.print(i + " ");
		}
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i].compareTo(list[j]) < 0) {
					E temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}
