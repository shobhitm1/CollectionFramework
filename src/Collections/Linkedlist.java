package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// LinkedList is a collection/array which stores actual data and reference of
		// next variable.
		// In Singly LinkedLIst has a head which points to first data.Last node
		// reference variable points to null value.
		LinkedList<String> li = new LinkedList<String>();
		li.add("qtp");
		li.add("selenium");
		li.add("Shobhit");
		li.add("API");
		// addFirst method
		li.addFirst("Java");
		System.out.println(li);
		// You can't be average
		// addLast Method
		li.addLast("Covid");
		System.out.println("*******");
		System.out.println(li);
		System.out.println("*******");
		// Get and set values of LinkedList
		System.out.println(li.get(0));
		li.set(0, "Harry");
		System.out.println(li);
		// Remove First and Last Method
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);

		// Remove on the basis of index
		System.out.println("*******");
		li.remove(2);
		// Iterating through LinkedList
		for (int k = 0; k < li.size(); k++) {
			System.out.println(li.get(k));
		}
		// Advanced for loop
		System.out.println("*******");
		for (String str : li) {
			System.out.println(str);
		}
		// Using Iterator
		System.out.println("*******");
		Iterator<String> it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*******");

		// Using While Loop
		int j = 0;
		while (li.size() > j) {
			System.out.println(li.get(j));
			j++;
		}
	}

};
