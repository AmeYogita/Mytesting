package patternractice;

public class starPattern {

	public static void main(String[] args) {
		
		// all patterrns
		
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
		for(int i=1;i<=+5;i++) 
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=============================================");
		
		
		
//		*
//		**
//		***
//		****
//		*****
		
		
		int star=1;
		
		for(int i=1;i<=5;i++) 
		{
			for(int j =1;j<=star;j++) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
			star++;
			
		}
		System.out.println("=============================================");
		
//		     *
//		    **
//		   ***
//		  ****
//		 ***** 
		
		int star1=1;
		int space=4;
		
		for(int i =1;i<=5;i++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int k =1;k<=star1;k++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
			space--;
			star1++;
		}
		System.out.println("=============================================");
		
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		
		int star2=1;
		int space1=4;
		
		for(int i =1;i<=5;i++) 
		{
			for(int j=1;j<=space1;j++) 
			{
				System.out.print(" ");
			}
			for(int k =1;k<=star2;k++) 
			{
				System.out.print("* ");
				
			}
			System.out.println();
			space1--;
			star2++;
		}
		System.out.println("=============================================");
		
//		*****
//		****
//		***
//		**
//		*
		
		int star3=5;
		int space2=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=star3;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space2;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star3--;
			space2++;
		}
		System.out.println("=============================================");
		
//		*******
//		 *****
//		  ***
//		   *
		

		
		int star4=1;
		int space4=5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star4;j++)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=space4;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star4++;
			space4--;
		}
		
			
	}

}
