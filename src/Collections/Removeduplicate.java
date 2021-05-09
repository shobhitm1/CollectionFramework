package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Removeduplicate {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,23,14,11,53,6,37,1,5,2,23));
		//1.Using LinkedHashSet
		LinkedHashSet<Integer> ls =new LinkedHashSet<Integer>(ar);
		ArrayList ar2 = new ArrayList(ls);
		
		System.out.println(ar2);
		
		//2 Using JDSK8 Stream
		
		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(1,2,23,14,11,53,6,37,1,5,2,23,90,90,23,11,15));
		
		List<Integer> marksListUnique =ar3.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		

	}

}
