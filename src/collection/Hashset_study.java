package collection;

import java.util.HashSet;

public class Hashset_study {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add("Ameya");
		hs.add("loves");
		hs.add("Yogita");
		hs.add("Ameya");
		hs.add("Nalawade");
		hs.add("WEDS");
		hs.add("Thombe");
		
		System.out.println(hs);
		System.out.println("=======================================================");
		for(Object o:hs) {
			System.out.println(o);
		}
		System.out.println("=======================================================");
		
		System.out.println(hs.size());
		System.out.println("=======================================================");
		
		hs.add(null);
		
		System.out.println(hs);
		System.out.println("=======================================================");
		
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		System.out.println("=======================================================");
		
		System.out.println(hs.remove(null));
		System.out.println(hs);
		System.out.println("=======================================================");
		
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("=======================================================");
		
		
		
	

	}

}
