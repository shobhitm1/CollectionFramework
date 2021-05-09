package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class arraylist {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		// int a[]=new int[3]; //static array
		// 1.Size does not matter in arrayList
		// 2.Can have duplicate values
		// 3.it is synchronized.
		// to get all the values of collection ,we need for loop
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Piku");
		ar.add("Shanta");
		ar.add("Diwar");
		ar.add("Gulabo");
		ar.add("Haider");
		System.out.println("Size of this arrayList is"+" "+ar.size());
		System.out.println("******");	
		System.out.println("Element at third index is:-"+" "+ar.get(3));
		System.out.println("******");	
		//There are 6 ways to traverse arrayList
		
		// 1.Get all values Using For Loop with index/order
		System.out.println("Using for loop");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("******");	
		
		//2.Using java8 with for-each loop and lambda
		System.out.println("Using for loop and lamdba");
		ar.forEach(item->System.out.println(item));
		System.out.println("*****");
		
		//3.Using iterator and for-each remaining method
		System.out.println("Using Iterator and for-each remaining method");
		Iterator<String> it3=ar.iterator();
		it3.forEachRemaining(move->{
			System.out.println(move);
		});
		System.out.println("*****");
		
		//4.using iterator
		System.out.println("Using Iterator");
		Iterator<String> it2 =ar.iterator();
		while(it2.hasNext()) {
		
			System.out.println(it2.next());
		}
		System.out.println("*****");
		
		//5. using for-each loop
		System.out.println("Using for each loop");	
		for(String m :ar) {
			System.out.println(m);
		}
		System.out.println("*****");
		
		//6. using Listiterator() to reverse in both the directions
				System.out.println("Using Listiterator() to reverse in both the directions");
				ListIterator<String> itm =ar.listIterator(ar.size());
				while(itm.hasPrevious()) {
					System.out.println(itm.previous());
				}
				System.out.println("*****");
				
		//How to Store User created class objects in ArrayList.
		// employee class objects
		System.out.println("Storing objects in arrayList");
		employee e1 = new employee("Shobhit", 21, "QA");
		employee e2 = new employee("Ram", 23, "QAtech");
		employee e3 = new employee("Shyam", 20, "QAeng");
		ArrayList<employee> ar4 = new ArrayList<employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		System.out.println("*****");
		// 2. Using Iterator to traverse all the values of ArrayList
		Iterator<employee> it=ar4.iterator();
		
		while(it.hasNext()) {
			employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("***************");
		//AddAll Method
		System.out.println("Using Add all Method");
		ArrayList<String> ar5 =new ArrayList<String>();
		ar5.add("test");ar5.add("selenium");ar5.add("students");
		ArrayList<String> ar6 =new ArrayList<String>();
		ar6.add("java");ar6.add("cypress");ar6.add("teacher");
		ar5.addAll(ar6);
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		
		System.out.println("*******");
		//RemoveAll Method
		System.out.println("Using Remove all Method");
		ar5.removeAll(ar6);	
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		System.out.println("********");
		//RetainAll Method
		System.out.println("Using Retain all Method");
		ArrayList<String> ar7 =new ArrayList<String>();
		ar7.add("QTP");ar7.add("test");ar7.add("API");
		ArrayList<String> ar8 =new ArrayList<String>();
		ar8.add("QTP");ar8.add("Sele");ar8.add("API");
		ar7.retainAll(ar8);
		for(int k=0;k<ar7.size();k++) {
			System.out.println(ar7.get(k));
			
		}
		
		System.out.println("********");
		System.out.println("Using Remove method of Iterator");
	
		Iterator i = ar.iterator();
		while(i.hasNext()) {
		String abc= (String) i.next();	
		if(abc.equals("Shanta")) {
			i.remove();
			System.out.println("Shanta is removed");
			break;
		}
		}
		 System.out.println("\nThe ArrayList elements are: ");
	      for (String s: ar) {
	         System.out.println(s);
	      }
		
		
	}

}
