package listInterface;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	//implements Dequeue Interface
	public static void main(String[] args) {
		
		//		String str = "name";
		//		String str2 = "name";
		//		str = "nimkname";
		//		System.out.println(str);

		//Linked List -- Each node has data and refferance of its next node
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("series");
		ll.add("Complete");
		System.out.println("Linked List values: "+ll);

		//addFirst and addLast methods
		ll.addFirst("###");
		ll.addLast("###");
		System.out.println("Linked List values: "+ll);

		//Linked list reshuffels the elements after removal of an element 
		System.out.println("*Reshuffels the list*");
		System.out.println(ll.get(2));
		ll.remove(2);
		System.out.println(ll.get(2));
		ll.add(2,"series");

		//to remove first and last values
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Linked List values: "+ll);

		System.out.println("peek");
		System.out.println(ll.peek());
		ll.poll();

		//ll.remove(1);

		// print all the values of Linked list
		System.out.println("Linked List values: "+ll);		

		//for loop
		System.out.println("Using for loop : ");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//advance for loop
		System.out.println("Using advance for loop: ");
		for(String str : ll) {  // str checks all strings in the object and prints
			System.out.println(str);
		}
		//iterator
		System.out.println("Using Iterator and while loop: ");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//using Collections iterator/iterate over collections
		System.out.println("iterate over collections: ");
		for (Iterator iterator = ll.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		//Using while loop
		System.out.println("Using while loop: ");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}

		//adding student object in linked list
		LinkedList<Student> llstd = new LinkedList<Student>();
		for (int i = 0; i < 10; i++) {
			llstd.add(new Student(i,"name"+i));
		}
		//iterating student linked list
		for (Iterator objIterator = llstd.iterator(); objIterator.hasNext();) {
			Student student = (Student) objIterator.next();
			
			System.out.println(student.studentNo + " " +student.name);
			//System.out.println(student.getName());
		}
	}
}


class Student {
	int studentNo;
	String name;
//	public int getStudentNo() {
//		return studentNo;
//	}
//	public void setStudentNo(int studentNo) {
//		this.studentNo = studentNo;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	// constructor of student class
	public Student(int studentNo, String name) {
		//super();
		this.studentNo = studentNo;
		this.name = name;
	}
}