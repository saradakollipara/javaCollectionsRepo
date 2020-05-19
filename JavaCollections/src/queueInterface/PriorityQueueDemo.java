package queueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//elements are retrieved in FIFO basis
		//elements are sorted and stored in sorted order when we poll 
		pq.add(43);
		pq.add(0);
		pq.add(3);
		pq.add(99);
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.add(1);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		Queue<String> pq2 = new PriorityQueue<String>();
		pq2.add("Selenium");
		pq2.add("QTP");
		pq2.add("SoapUI");
		pq2.add("ReadyAPI");
		pq2.add("AAAAA");
		pq2.add("ZZZZZZZZ");
		pq2.add("aaaa");
		pq2.add("zbank");
		pq2.add("Bank");
		pq2.offer("1234");

		System.out.println(pq2); //elements are printed in randon order
		System.out.println(pq2.peek());
		
		System.out.println("***Iterator***");
		for (Iterator<String> iterator = pq2.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("***Using poll***");
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		System.out.println(pq2.poll());
		
	}

}
