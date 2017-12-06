/**
 * 
 */
package com.dhruval.generics;

/**
 * @author Dhruval Variya. Email : dhruvalv@gmail.com
 *
 */
public class GenericSelectionSort {
	public static void main(String[] args) {
		Integer[] iArr = new Integer[] { 16, 21, 11, 13, 14, 15, 01 };
		Double[] dArr = new Double[] { 11.6, 19.2, 13.2, 15.3, 11.4 };
		String[] sArr = new String[] { "ABB", "XBB", "AAC", "QAD", "BCE" };

		System.out.println("Generic Selection Sort");
		System.out.print("Sorted Integers : ");
		selectionSort(iArr);
		for (Integer i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Doubles : ");
		selectionSort(dArr);
		for (Double i : dArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Strings : ");
		selectionSort(sArr);
		for (String i : sArr) {
			System.out.print(i + " ");
		}
	}

	public static <E extends Comparable<E>> void selectionSort(E[] list) {
		int n = list.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (list[j].compareTo(list[min]) < 0)
					min = j;

			E temp = list[min];
			list[min] = list[i];
			list[i] = temp;
		}
	}

}
