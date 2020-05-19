package listInterface;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		List<Integer> vl = new Vector<Integer>();
		vl.add(1); 
		//		for(int i =0;i<=10;i++) {
		//			vl.add(i, i+1);
		//		}
		vl.add(1);
		vl.add(2);
		vl.add(3);
		vl.add(4);
		vl.add(9);
		vl.add(new Integer(10));
		System.out.println(vl);
		System.out.println(vl.indexOf(4));
		System.out.println("Size : " + vl.size());

		//vl.add(new Integer(null));

		for (Iterator<Integer> iterator = vl.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		Vector<Integer> v2 = new Vector<Integer>();
		v2.addAll(vl);
		v2.setSize(5);
		System.out.println(v2);
		v2.add(100);
		System.out.println(v2);
		
		//Traverse Vector with Enumeration Object
		Enumeration<Integer> enumObj = v2.elements();
		
		while(enumObj.hasMoreElements()) {
			System.out.println(enumObj.nextElement());
		}


	}

}
