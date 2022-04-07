package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_Study {

	public static void main(String[] args) {


		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("ameya");
		lhs.add("ameya");
		lhs.add("tanya");
		lhs.add("parshu");
		
		System.out.println(lhs);
		System.out.println("====================================================");
		
		for(Object a:lhs) {
			System.out.println(a);
		}
		System.out.println("====================================================");
		
		Iterator it = lhs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====================================================");
		
		lhs.add("sanky");
		lhs.add("hitesh");
		
		Iterator it1 = lhs.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			
		}
		System.out.println("====================================================");
	}

}
