package pratise_example;

import java.util.Scanner;

public class HcmLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter hcf value");
		int a = sc.nextInt();
		System.out.println("enter lcm value");
		int b = sc.nextInt();
		int hcf=0;
		for(int i =1;i<=a;i++) 
		{
			if(a%i==0 & b%i==0) 
			{
				hcf=i;
				
			}
			
		}
		System.out.println("this is the hcf value "+hcf);
		int lcm = (a*b)/hcf;
		System.out.println("this is lcm value  "+lcm);
		
}}
