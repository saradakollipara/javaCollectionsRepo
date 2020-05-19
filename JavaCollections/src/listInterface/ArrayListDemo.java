package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import mapInterface.Employee;

public class ArrayListDemo {

	public static <E> void main(String[] args) {

		int a[] = new int[3];  // static array - size is fied

		//Dynamic array  - Array List:
		// Can contain duplicates values
		// It maintains insertion order
		// It is not synchronized  - Slow when compared to other Collections
		// Allows random access to fetch any elements coz it stores values on bases of index

		List ar = new ArrayList();
		ar.add(10);  // added the given arguments in the array
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add("Test");
		ar.add(24.2);
		System.out.println(ar.size());  // to get the size of array
		System.out.println(ar.get(4));  //get value from an index
		// to print all the values from the Array list use for loop

		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}

		//Non generic Vs Generic
		
		List<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(23);
		//ar1.add("name"); Generics concept, if you defined the array type then it will not take any other type of datatype

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Name");
		ar2.add("Shar");
		ar2.add("kollipara");
		System.out.println(ar2);
		System.out.println(ar2.get(1));
		ar2.remove(1);
		System.out.println(ar2.get(1));
		System.out.println("######");


		//If we do not know the data type of the elements stored in the array list
		ArrayList<E> ar3 = new ArrayList<E>();
		//ar3.add(123, null);
		//ar3.add((E) "Name");

		// Emplayee Class Object
		Employee objEmployee = new Employee("Sharada", 35, "Automation Leed");
		Employee objEmployee2 = new Employee("Sarala", 46, "Automation Tester");
		Employee objEmployee3 = new Employee("Keerthi", 42, "QA");

		//Create Array list
		ArrayList<Employee>ar4 = new ArrayList<Employee>();  // can store Employee type of Objects
		ar4.add(objEmployee);
		ar4.add(objEmployee2);
		ar4.add(objEmployee3);				
		//Use Iterator to traverse the values
		Iterator <Employee>it = ar4.iterator(); //Iterator reference of type Employee
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//addAll()  -- adds/merge one arrayList values to other
		System.out.println("***********addAll()************");
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Sridhar");
		ar5.add("1");
		ar5.add("45");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar5.add("Giridhar");
		ar5.add("2");
		ar5.add("50");
		
		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		//removeAll()
		System.out.println("******removeAll()*************8");
		ar5.removeAll(ar6);
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		//retainAll()  -- prints only the common value from two objects
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Giridhar");
		ar7.add("3");
		ar7.add("100");
		
		ar5.retainAll(ar7);
		System.out.println("**********retainAll()**************");
		for(int i=0;i<ar5.size();i++){
			System.out.println(ar5.get(i));
		}
		
		
	//	LinkedList <String>ll = new LinkedList<String>();
	
		
		
	}
}
