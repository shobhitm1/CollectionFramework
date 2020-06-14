package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) { //Examples of Maps:-ErrorCodes
		//Map of Zip codes //Storing Testdata //Configuration/env variables.
		//containsKey(key)//remove(key)//putAll() 
		//entrySet() :-returns set view containg all the keys and values
		//Keyset():-returns the set view containing all the keys
		//Map is a collection in java which store data in the form of key and value pair.
		//Map has two classes:- HashTable and HashMap // HashMap has subclass:-LinkedHashMap
		//Map has child interface:-SortedMap //SortedMap has one sub interface:-NavigableInterface
		//NavigableMap Interface has sublclass:-TreeMap
		//Map<Key,Value> //
		Map<String,String> mp =new HashMap<String,String>();
		mp.put("Name", "Shobhit");
		mp.put("RollNo", "2");
		System.out.println(mp.get("Name"));
		

	}

}
