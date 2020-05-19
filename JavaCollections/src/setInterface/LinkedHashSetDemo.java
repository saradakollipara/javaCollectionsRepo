package setInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	//Has two way linking for the elements. 
	//Else is same as hashset
	//Maintains insertion order
	//Difference between HashSet and linked HashSet is 
		//Hashset does not guarantee insertion order,
		//Linked hashset maintains insertion order.
	
	public static void main(String[] args) {

		LinkedHashSet <Integer> lhashSet = new LinkedHashSet<Integer>();
		lhashSet.add(12);
		lhashSet.add(1);
		lhashSet.add(120);
		lhashSet.add(1200);
				
		for (Iterator iterator = lhashSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}


		
	
 	}

}
