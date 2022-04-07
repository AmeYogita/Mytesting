package pratise_example;

public class Aarmss {

	public static void main(String[] args) {
	
		
		//armstrong no 
		int no=371;
		int no1 = no;
		int l =0;
		while(no1!=0);
		{
			l = l+1;
			no1=no1/10;
		}
		//System.out.println(no1);
		int no2=no;
		int arms = 0;
		int reminder;
		while(no2!=0) 
		{
			int sum =1;
			reminder=no2%10;
			for(int i =1;i<1;i++) {
				sum=sum*reminder;
			}
			arms=arms+sum;
			no2=no2/10;
			//System.out.println(no2);
		}
		if(arms==no1) {
			System.out.println(no1+"  is arms");
		}
		else {
			System.out.println(no1+" is not arms");
			
		}

	}

}
