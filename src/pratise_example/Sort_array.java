package pratise_example;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
		
		
		String [] s ={"Sanket","Tanmay","Parshuram","Mangesh","Ameya","Hitesh"};
		Arrays.sort(s);
		for(int i = s.length-1;i>=0;i--) 
		{
			System.out.println(s[i]);
		}
		

	}

}
