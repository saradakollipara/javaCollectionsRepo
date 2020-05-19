package mapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractise {

	public static void main(String[] args) {
		
		//Different ways of HashMap creation: 
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		//with initial capacity 30
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(30);
		//with initial capacity and load factor
		HashMap<Integer, String> hm3 = new HashMap<Integer, String>(20,0.50f);
		//creating Hashmap by copying another HP
		HashMap<Integer, String> hm4 = new HashMap<Integer, String>(hm1);
		
		//How to add key-value pairs into hash map
		hm1.put(201,"Test201");
		hm1.put(203,"Test203");
		hm1.put(202,"Test202");
		hm1.put(204,"Test204");
		hm1.put(205,"Test205");
		hm1.put(208,"Test208");
		
		Set<Integer> set = hm1.keySet();
		Iterator<Integer> it = set.iterator();
		System.out.println("Using Iterator---");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		Set<Entry<Integer,String>> entrySet = hm1.entrySet();
		System.out.println("USing for each loop---");
		for(Entry<Integer, String> data : entrySet) {
			System.out.println(data.getKey() + " : " + data.getValue());			
		}
		
		hm4.put(210, "Test210");
		hm4.putAll(hm1);
		//add given key-value pair only if it is not present in map
		hm4.putIfAbsent(210, "Test210");
		hm4.putIfAbsent(211, "Test211");
		hm4.putIfAbsent(212, "Test212");
		hm4.putIfAbsent(200, "Test200");
		
		//Retrieve a value with given key
		System.out.println("Value in the key : "+ hm4.get(200));
		
		//Check if particular key and value exists in hashmap
		if(hm4.containsKey(205)) {
			System.out.println("Value of key 205 : "+hm4.get(205));
		}
		
		if(hm4.containsKey(220)) {
			System.out.println(hm4.get(220));
		}
		else {
			System.out.println("Key not present...");
		}
		
		//Find no.of key value mapping in hashmap
		System.out.println("Size of Map : "+hm4.size());
		
		//Retrive all the keys present in HM
		Set<Integer> keySet = hm4.keySet();
		for(Integer key : keySet) {
			System.out.println("All keys : "+key);
		}
		
		//Retrive all values of Map
		Collection<String> setValue =  hm4.values();
		for (String valueSet :setValue) {
			System.out.println("All values : "+valueSet);
		}
		//Using Itarator...
		System.out.println("Using Itarator...");
		Iterator<String> it2 = setValue.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
//		hm4.put(100, "Test100");
//		hm4.remove(200);
		
		System.out.println("Using Itarator...After remove");	
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		//Remove all key-values  		
		hm2.putAll(hm1);
		System.out.println("Hm2 elements: ");
		System.out.println(hm2);
		hm2.clear();
		System.out.println(hm2);
		
		Set<Entry<Integer,String>> entrySet2 = hm4.entrySet();
		System.out.println("After adding values---");
		for(Entry<Integer, String> data : entrySet2) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}		
		
		hm4.remove(200);
		System.out.println("After Remove using same entrySet:  ");
		for(Entry<Integer, String> data : entrySet2) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		
		
	}

}
