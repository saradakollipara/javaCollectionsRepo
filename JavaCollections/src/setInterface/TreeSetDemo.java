package setInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	//TreeSet stores in natural order or default order.
	// does not allow duplicate values
	//Impliments Comparable Interface in Student class to order the objects on basis of custome order. 
			//Else ClassCastException will occur
	//override compareTo method 
	
	
	public static void main(String[] args) {

		TreeSet<Integer> tSet = new TreeSet<Integer> ();
		tSet.add(0);
		tSet.add(100);
		tSet.add(2);
		tSet.add(2);
		tSet.add(11);
		tSet.add(-1);
		
		for (Iterator iterator = tSet.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		//Create Student object and store in Set
		//Depending on the login in compareTo method the user defined objects are sorted irrespective of the insertion order.  
		TreeSet<Student> tSet2 = new TreeSet<Student> ();
		Student s3 = new Student(3,"test3");
		tSet2.add(s3);
		Student s1 = new Student(1,"test1");
		tSet2.add(s1);
		Student s2 = new Student(2,"test2");
		tSet2.add(s2);
				
		for (Iterator iterator = tSet2.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			System.out.println("Student No - " + student.getsNo() + " Student Name - " + student.getsName());
		}

		
		
	}
	

}
