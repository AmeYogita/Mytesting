package pratise_example;

public class StarPattern {

	public static void main(String[] args) {
		
		//right angle triangle
		//by putting space before star it becomes triangle
		
		
		for(int i=0;i<=5;i++) 
		{
			for(int j=i;j<=5;j++) 
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" *");
				
			}
			System.out.println();
				
		}
		
		}

	}


