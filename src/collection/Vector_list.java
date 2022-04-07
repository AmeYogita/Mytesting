package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_list {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("Ameya");
		v.add("Tanmay");
		v.add("Sanket");
		v.add("Hitesh");
		v.add("parshu");
		
		System.out.println(v);
		System.out.println("==========================================================");
		
		v.add(1,"Yogita");
		System.out.println(v);
		System.out.println("==========================================================");
		
		v.add(0,05);
		System.out.println(v);
		System.out.println("==========================================================");
		
		v.remove(0);
		System.out.println(v);
		System.out.println("==========================================================");
		
		System.out.println(v.get(1));
		System.out.println("======================BY FOR LOOP====================================");
		
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
		}
		System.out.println("======================BY FOR EACH LOOP==============================");
		
		for(Object a:v) {
			System.out.println(a);
		}
		System.out.println("======================BY ITERATOR ==================================");
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======================BY LISTITERATOR===============================");
		
		ListIterator lit = v.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("======================BY ENUMERATION=================================");
		
	    Enumeration el = v.elements();
	    while(el.hasMoreElements()) {
	    	System.out.println(el.nextElement());
	    }
	    System.out.println("==========================================================");
		
		System.out.println(v.size());
		System.out.println("==========================================================");
		System.out.println(v.isEmpty());
		System.out.println("==========================================================");
		System.out.println(v.contains("Yogita"));
		System.out.println("==========================================================");
		
		
		v.add(lit);
		System.out.println(v);
		System.out.println("==========================================================");
		v.add(v);
		System.out.println(v);
		System.out.println("==========================================================");
		v.remove(lit);
		System.out.println(v);
		System.out.println("==========================================================");

	}

}
