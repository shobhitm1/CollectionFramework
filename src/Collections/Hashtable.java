package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//JVM provides hashcode(32 bit number )
		//
		//Hashtable is synchronised while hashmap is asynchronised.
		//It stores key on the basis of hashcode of the object.
		//Key specified by object ,every object has unique hashcode //Java object is defined by 32 bit signed integer i.e. Hashcode.
		//JVM provides Hashcode number //If two objects are equal then hashcode should be the same.
		//Hashtable stores the value on the basis of hashcode of the key //It is synchronised.(at  a time ony one thread will attack the objet.)
		//Hashtable ignores duplicate values.//It can nt have null key and null values.//will givr nullPointerecption on adding null key or null value. 
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1,"Shobhit");h1.put(2,"Ankur");h1.put(3,"Pranay");
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>(); 
		
		//Cloning of objects
		h2 = (Hashtable<Integer, String>) h1.clone();
		System.out.println(h1);
		System.out.println(h2);
		
		
	//	h1.clear(); //Clear the values of h1 object.
		System.out.println(h1);
		System.out.println(h2);
		
		boolean b = h2.contains("Ankur");
		
		
		System.out.println(b);
		//Traverse values of hashtable
		Enumeration<String> e =h2.elements(); 
		  System.out.println("Printing elements of hashtable");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Set<Entry<Integer, String>> e1 =h2.entrySet();
		System.out.println(e1);
		//compare two hashtables
		if(h1.equals(h2)) {
			System.out.println("Both hashtables are same");
		}
		System.out.println("Get the values of hashtable using key");
		System.out.println(h2.get(1));
		//Get the hashcode of the hastable object.
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println("Hence both Hashtables are same");
	}

}
