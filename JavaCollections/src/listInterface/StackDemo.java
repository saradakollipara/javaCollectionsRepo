package listInterface;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(123);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(100);
		System.out.println(stack);  //the elements are stored in inserssion order.
		System.out.println(stack.peek()); //LIFO method is maintained to get the elements
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		stack.firstElement();
		System.out.println(stack.lastIndexOf(10, 2));
		
		for (Iterator<Integer> iterator = stack.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
