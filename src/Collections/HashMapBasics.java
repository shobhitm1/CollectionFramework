package Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapBasics {
	//HashMap is non-synchronised/Not thread Safe.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap is a class and extends AbstractMap class.
		//No order is maintained.//stores only on the basis of (key,value) pair
		//nly 1 null 
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Shobhit");
		hm.put(2,"Rohan");
		hm.put(3,"Akshay");
	//	hm.put(null,"zero");
	//	hm.put(null,"one"); 
		System.out.println(hm.get(null));
		
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext()) {
			Integer keysss=it.next();
			String values=hm.get(keysss);
			System.out.println("key="+ keysss +" values "+ values);
			}
		hm.remove("null");
		System.out.println("-----------------");
		Iterator<Entry<Integer,String>>ip=hm.entrySet().iterator();
		while(ip.hasNext()) {
			Entry<Integer,String> entry=ip.next();
			System.out.println("Keys = "+entry.getKey()+ "values = "+ entry.getValue());
		}
		System.out.println("-----------------");
		hm.forEach((k,v)->System.out.println(" Key = "+ k+" and value = "+ v));
		
		hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);  
		
 
		
	}

}
