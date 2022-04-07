package collection;

import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(55);
		ts.add(555);
		ts.add(555555555);
		ts.add(55555);
		
		System.out.println(ts);
		System.out.println("====================================================");
		for(Integer a:ts) {
			System.out.println(a);
		}
		

	}

}
