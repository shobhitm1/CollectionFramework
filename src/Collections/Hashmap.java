package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		//HashMap is a bucket of nodes .Each node is a linked list node.
		//HashMap extends abstractMap class and implements Map interface
		//It contains only unique values on the basis of key and value pair.
		//HashMap can have null values.//It maintans no order.
		//HashMap is non synchronised.It is not thread safe.Multiple thread can access it.
				//DrawBack:-If any thread updates the value then other thread will get the updated value.(Fail-Fast Condition)
				//ConcurrentModificationException
				//Nonsynchronised meand:- all threads can attack object at the same time.
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Shobhit");hm.put(2,"Rohan");hm.put(3,"Akshay");
		//To print all the values of Hashmap
		//System.out.println(hm.get(1));
		//Traversing Using keyset() Method
		Set<Integer> keys =hm.keySet();
		for(Integer key: keys) {
			System.out.println(key+" "+hm.get(key));
		}
		System.out.println("****");
		System.out.println(hm.entrySet());
		System.out.println("****");
		for(Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			//System.out.println(m);
			}
		System.out.println("****");
		System.out.println(hm);
		System.out.println("****");
		//Remove particualr key
		//hm.remove(2);
		System.out.println("*****");
		//System.out.println(hm);
		
		employee e1	 = new employee("Shobhit",22,"TQA");
		employee e2	 = new employee("Rohit",32,"Design");
		employee e3	 = new employee("Mudit",22,"Market");
		HashMap<Integer,employee> emp = new HashMap<Integer,employee>();
		emp.put(1, e1);
		emp.put(2, e3);emp.put(3, e2);
		//Traverse the HashMap
		for(Map.Entry<Integer, employee> m: emp.entrySet()) {
		int key = m.getKey();
		employee  e  =m.getValue();
		System.out.println("Employee"+key+"info");
		System.out.println(e.name+" "+e.age+" "+e.dept);
		}
		
	}
}
