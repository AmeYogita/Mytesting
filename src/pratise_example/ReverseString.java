package pratise_example;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// palindrome and reverse string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
	
		String a = sc.next();
		String rev = "";
		for(int i = a.length()-1;i>=0;i--) 
		{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
		if(rev.equals(a)) 
		{
			System.out.println("It is palendrome string");
			
		}
		else {
			System.out.println("It is not a palendrome string");
		}
		System.out.println("============================================================");
		
//
//		//System.out.println("Enter a string");
//		String str = "Hi I am Velocity";
//		String s[]=str.split(" ");
//		
//		for(int i=s.length-1;i>=0;i--) {
//			System.out.print(s[i]+" ");
//		}
		
	

	}

}
