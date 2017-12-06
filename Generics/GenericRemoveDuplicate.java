package com.dhruval.generics;

import java.util.ArrayList;

/**
 * @author Dhruval Variya. Email : dhruvalv@gmail.com
 *
 *         Remove duplicate from the list
 */
public class GenericRemoveDuplicate {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(11);
		list.add(0);
		list.add(11);
		list.add(2);
		list.add(2);
		list.add(73);
		list.add(2);
		list.add(1);
		list.add(8);
		list.add(69);
		list.add(70);

		System.out.println("List Before removing duplicates : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		list = removeDuplicates(list);
		System.out.println("\nList After removing duplicates : ");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	// This method supports Any type of list e.g. Integer, Double, String.
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> uniq = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!uniq.contains(list.get(i))) {
				uniq.add(list.get(i));
			}
		}
		return uniq;
	}
}
