package pratise_example;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number ");
		int no = sc.nextInt();
		int temp = no;
		int rev=0;
		int rem ;
		while(temp!=0) 
		{
			rem =temp%10;//123
			rev=rev*10+rem;//3,2,1
			temp=temp/10;
			
		}
		System.out.println(rev);
	}

}
