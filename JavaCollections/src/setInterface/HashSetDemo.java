package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Does not maintain insertion order
		//Does not allow duplicate values.
		//if the values stored in hash set are equal, then they will be stored with same hash code.
		
		HashSet<Integer> hset = new HashSet<Integer> ();
		
		hset.add(20);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		hset.add(40);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);

		hset.add(10);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);

		hset.add(40);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		hset.add(200);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);

		hset.add(20);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);

		hset.add(300);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		hset.add(300);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		hset.add(300);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		hset.add(20);
		System.out.println("Hash code - "+hset.hashCode());
		System.out.println(hset);
		
		System.out.println("****Integer Iterator*****");
		for (Iterator iterator = hset.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		//adding Student object	
		System.out.println("Student Object");
		HashSet <Student> shSet = new HashSet<Student> ();
		
		Student s1 = new Student(1,"sahr");
		System.out.println(s1.hashCode());
		Student s2 = new Student(1,"sahr");
		System.out.println(s2.hashCode());
		Student s3 = new Student(1,"sahr");
		Student s4 = new Student(4,"sahr");
		System.out.println(s4.hashCode());

		Student s5 = new Student(5,"sahr");
		System.out.println(s5.hashCode());

		shSet.add(s1);
		shSet.add(s2);
		shSet.add(s3);
		shSet.add(s4);
		shSet.add(s5);
		
		//as the hashcodes of different student objects are different 
		//they allow duplicate values to store
		//objects contain same values and hash codes are different 
		      //but as its reference is different so duplicates are allowed to store.
				// and the objects are stored in linked list format. 
		
		//hashCode and equals methods are to be overrided when using Hashset
		// 	to store objects.
		
		//Though the object values are equal, as their reference is different they are stored with different hash code
		
		
		for (Iterator iterator = shSet.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println(student.sName);
		}		
	}

}
