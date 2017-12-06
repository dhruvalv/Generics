/**
 * 
 */
package com.dhruval.generics;

/**
 * @author Dhruval Variya. Email : dhruvalv@gmail.com
 *
 */
public class GenericInsertionSort {
	public static void main(String[] args) {
		Integer[] iArr = new Integer[] { 16, 21, 11, 13, 14, 15, 01 };
		Double[] dArr = new Double[] { 11.6, 19.2, 13.2, 15.3, 11.4 };
		String[] sArr = new String[] { "ABB", "XBB", "AAC", "QAD", "BCE" };

		System.out.println("Generic Insertion Sort");
		System.out.print("Sorted Integers : ");
		insertionSort(iArr);
		for (Integer i : iArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Doubles : ");
		insertionSort(dArr);
		for (Double i : dArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Sorted Strings : ");
		insertionSort(sArr);
		for (String i : sArr) {
			System.out.print(i + " ");
		}
	}

	public static <E extends Comparable<E>> void insertionSort(E[] list) {
		int n = list.length;
		for (int i = 1; i < n; ++i) {
			E key = list[i];
			int j = i - 1;

			while (j >= 0 && (list[j].compareTo(key) > 0)) {
				list[j + 1] = list[j];
				j = j - 1;
			}
			list[j + 1] = key;
		}
	}

}
