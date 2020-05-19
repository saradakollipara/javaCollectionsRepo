package mapInterface;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {
	
	/*HashTable is similar to HashMAp
	 * Stores the value on the basis of key-value
	 * key --> Object; Hashcode --> Value
	 * HashTable is synchronized
	 * Stores only unique elements, if you add duplicate values it will ignore
	 * Sorts the values based on the keys
	 * Null keys and null values are not allowed -- will give null pointer exception
	 */
	public static void main(String[] args) {
		
		Hashtable <Integer,String>ht = new Hashtable<Integer,String>();
		ht.put(4, "Tick Tock");
		ht.put(1, "Tom");
		ht.put(2, "Tim");
		ht.put(3, "Tick");
		//To create a clone of Hash table to another 
		Hashtable <Integer,String>htClone = new Hashtable<Integer,String>();
		htClone = (Hashtable) ht.clone();
		
		System.out.println(htClone.get(2));  // to return the value from specific key
		System.out.println("Values from ht" +ht);
		System.out.println("Values from htClone :" +htClone);
		
		ht.clear(); // to clear the values of hashtable
		//contains()
		if(htClone.contains("Tck")) {
			System.out.println("the value present");
		}else {
			System.out.println("the value is not present");
		}
		
		//to print all the values from HashTable -- enumeration
		Enumeration e = htClone.elements();
		System.out.println("Print values fron htClone through Enumeration:");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//to print values of hash table using entry set
		
		System.out.println("Print values fron htClone through Entry set:");
		Set s = htClone.entrySet();
		System.out.println(s);
		
		// to check if two hashtables are equal -- htClone.equals(ht) is used
		
		// to get the hashcode of hash table object
		System.out.println("Hash code value of hsClone : "+htClone.hashCode());
	}
}
