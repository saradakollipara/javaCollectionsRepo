package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class WaysToIterateArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> studentNameList = new ArrayList<String>();
		studentNameList.add("Kapal Mathur");
		studentNameList.add("Vikas Sen");
		studentNameList.add("Madan Kim");
		studentNameList.add("Srinivas Athota");
		studentNameList.add("Atul Sharma");
		
		studentNameList.trimToSize();  // to decrease current capacity of AL, used to minimize the storage space
		studentNameList.add("Himangani Sharma");

		//1. USing Java 8 for each loop and lamda expression
		System.out.println();
		System.out.println("---Using Java 8 for each loop and lamda expression---");
		
		studentNameList.forEach(shows -> {
			System.out.println(shows);
		});
		
		//2.USing Iterator
		System.out.println();
		System.out.println("---Using Iterator---");		
		
		Iterator<String> it = studentNameList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3.using itrator, foreachremaining() method, lamda expression
		System.out.println();
		System.out.println("---Using itrator, foreachremaining() method, lamda expression---");
		
		it = studentNameList.iterator();
		it.forEachRemaining(shows -> {
		System.out.println(shows);
		});
		
		//4.Using for each loop
		System.out.println();
		System.out.println("---Using for each loop---");
		
		for(String show: studentNameList) {
			System.out.println(show);
		}
		
		//5.Using for loop with order/index
		System.out.println();
		System.out.println("---Using for loop with order---");
		
		for(int i=0;i<studentNameList.size();i++) {
			System.out.println(studentNameList.get(i));
		}
		
		
		//6.Using a list Iterator and traverse in both the directions
		System.out.println();
		System.out.println("---Using a list Iterator and traverse in order---");
	
		ListIterator<String> studentListItertor = studentNameList.listIterator();
		while (studentListItertor.hasNext()) {
			System.out.println(studentListItertor.next());
		}
			
		System.out.println("---Using a list Iterator and traverse in reverse order---");
	
		ListIterator<String> studentListItertorRev = studentNameList.listIterator(studentNameList.size());
		while (studentListItertorRev.hasPrevious()) {
			System.out.println(studentListItertorRev.previous());
		}

		
		
	}

}
