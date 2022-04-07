package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;





public class LikedLIst_study {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("Ameya");
		ll.add("Yogita");
		ll.add("tanmay");
		ll.add("Sanky");
		
		System.out.println(ll);
		System.out.println("=======================================================");
		
		for(Object o:ll) {
			System.out.println(o);
		}
		System.out.println("=======================================================");
		
		ll.add("parshu");
		
		Iterator it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=======================================================");
		
		ll.add(4,"hitesh");
		
	    ListIterator lit = ll.listIterator();
	    while(lit.hasNext()) {
	    	System.out.println(lit.next()); 
	    }
		

	}

}
