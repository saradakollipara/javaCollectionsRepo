package queueInterface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	
	//implements Dequeue Interface
	//Elements can be added and removes on both ends of the array
	
	public static void main(String[] args) {
		
		Deque<Integer> adq = new ArrayDeque<Integer>();
		adq.add(5);
		adq.add(15);
		adq.add(10);
		System.out.println(adq);
		adq.addFirst(0);
		System.out.println(adq);
		
	}
}
