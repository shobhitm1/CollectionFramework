package Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[]=new int[3]; //static array
		// 1.Size does not matter in arrayList
		// 2.Can have duplicate values
		// 3.it is synchronized.
		// to get all the values of collection ,we need for loop
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(300);
		ar.add(300);
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		// 1.Get all values Using For Loop
		System.out.println("***************");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		//How to Store User created class objects in ArrayList.
		// employee class objects
		employee e1 = new employee("Shobhit", 21, "QA");
		employee e2 = new employee("Ram", 23, "QAtech");
		employee e3 = new employee("Shyam", 20, "QAeng");

		// ArrayList
		ArrayList<employee> ar4 = new ArrayList<employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		System.out.println("***************");
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
		ArrayList<String> ar5 =new ArrayList<String>();
		ar5.add("test");ar5.add("selenium");ar5.add("students");
		ArrayList<String> ar6 =new ArrayList<String>();
		ar6.add("java");ar6.add("cypress");ar6.add("teacher");
		ar5.addAll(ar6);
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
			
		}
		System.out.println("***************");
		//RemoveAll Method
		ar5.removeAll(ar6);	
		for(int j=0;j<ar5.size();j++) {
			System.out.println(ar5.get(j));
		}
		System.out.println("***************");
		//RetainAll Method
		ArrayList<String> ar7 =new ArrayList<String>();
		ar7.add("QTP");ar7.add("test");ar7.add("API");
		ArrayList<String> ar8 =new ArrayList<String>();
		ar8.add("QTP");ar8.add("Sele");ar8.add("API");
		
		ar7.retainAll(ar8);
		for(int k=0;k<ar7.size();k++) {
			System.out.println(ar7.get(k));
			
		}
		System.out.println("***************");
		
		
	}

}
