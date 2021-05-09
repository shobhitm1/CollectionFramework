package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertHashMaptoArrayList {

	

	public static void main(String[] args) {
		HashMap<String,Integer> comp =new HashMap<String,Integer>();
		comp.put("Google",1000);
		comp.put("Walmart",2000);
		comp.put("Amazon",30000);
		comp.put("Facebook",1200);
		comp.put("CIsco",15000);
		System.out.println("Size of this Hashmap"+" "+comp.size());
		Iterator it= comp.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry pairs=(Entry) it.next();
		System.out.println(pairs.getKey() +" "+pairs.getValue());
		}
		
		List<String> complist = new ArrayList<String>(comp.keySet());
		System.out.println("company size = " + complist.size());
		for(String c : complist) {
			System.out.println(c);
		}
		List<Integer> emplist = new ArrayList<Integer>(comp.values());
		System.out.println("Employee size = " + emplist.size());
		for(Integer t : emplist) {
			System.out.println(t);
		}
		
		

	}

}
