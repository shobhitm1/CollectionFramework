package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// LinkedList is a collection/array which stores actual data and reference of next variable.
		//it can be used as List,Stack,Queue
		// In Singly LinkedLIst has a head which points to first data.Last node
		// reference variable points to null value.
		//It can contain duplicate elements.It is non-synchronized.
		//Manipulation is fast in LL.(insertion and deletion)
		//LL constructors:
		//LinkedList() //LinkedList(Collection c)
		//Setting the value at already placed index will update the existing value.
	
		LinkedList<String> li = new LinkedList<String>();
		li.add("qtp");
		li.add("selenium");
		li.add("Shobhit");
		li.add("API");
		// addFirst method
		li.addFirst("Java");
		System.out.println(li);
		// addLast Method
		li.addLast("Covid");
		System.out.println("Adding Last Element-->");
		System.out.println(li);
		System.out.println("*******");
		// Get and set values of LinkedList
		System.out.println("Getting Zeroth Element Value-->");
		System.out.println(li.get(0));
		System.out.println("Setting Zeroth Element Value-->");
		li.set(0, "Harry");
		System.out.println(li);
		// Remove First and Last Method
		System.out.println("Using Remove First and Last Method-->");
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);
		System.out.println("*******");
		System.out.println("Adding First and Last Element again-->");
		//add first and last method
		li.addFirst("Sonya");
		li.addLast("Tanmay");
		System.out.println(li);
		//get(0) // to give the value at the specified index.
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
		System.out.println("*******");
		//addall() method
		LinkedList ll =new LinkedList();
		ll.add("Shobhit");ll.add("Sanjana");
		ll.addAll(li);
		System.out.println(ll);
	}

};
