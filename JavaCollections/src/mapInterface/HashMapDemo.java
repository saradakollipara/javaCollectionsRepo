package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		/*Hash map is a class which implements Map Interface
		 * extends AbstractMap 
		 * It contains only unique elements
		 * Stores the values in Key-Value format
		 * It may have only one null key and multiple null values
		 * It does not allow duplicate keys, it over rides with latest value
		 * It maintains no order
		 * HashMap is non-synchronized  -- not thread safe --multiple users can access it
		 * Fail Fast condition/ Concurrent modification exception will occur due to non-synchronization 
		 */
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Automation Tester");
		hm.put(2, "Manual Tester");
		hm.put(3, "API Tester");
		hm.put(null,"null key");
		hm.put(null,"null key2");
		hm.put(3, "API Tester duplicate");
		hm.put(3, "API Tester double duplicate");
		hm.put(4,  null); // allows multiple null values
		hm.put(5,  null);
		hm.put(6,  null);
		
		// To get the value based on key
		System.out.println(hm.get(3));  // to get a single value in HashMAp
		
		
		//******** HashMap to Set **********
		System.out.println("****HashMap to Set***");
		Set<Integer> set= hm.keySet(); 
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			System.out.println("Key: " + key+ " " + "value: " + hm.get(key));
			}
		
		//to get all the values in HashMap. Have to create Entry Set
		//Entry is a class in java to pull the values in key value pairs
		for(Map.Entry<Integer,String> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}
		
		hm.remove(2);
		System.out.println(hm); // To get the values in HashMap
		
		// To store objects in HashMap
		HashMap<Integer,Employee> hmEmp = new HashMap<Integer, Employee>();
		Employee emp1 = new Employee("Tim",30,"Chemical");
		Employee emp2 = new Employee("Peter",35,"Civil");
		Employee emp3 = new Employee("John",30,"Mechanical");

		hmEmp.put(1, emp1);
		hmEmp.put(2, emp2);
		hmEmp.put(3, emp3);
		
		//traverse HashMap
		 
		for(Entry <Integer,Employee> m: hmEmp.entrySet()) {
			System.out.println(m.getKey()+" Info:");
			Employee e = m.getValue();
			System.out.println(e.name+" "+ e.age +" "+ e.dept);
		}		
	}
}
