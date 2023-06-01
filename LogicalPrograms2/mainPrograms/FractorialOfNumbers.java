package mainPrograms;

public class FractorialOfNumbers 
{
	public static void main(String[] args) 
	{
		 int num = 6;
		 int fact = 1;
		         //i=6  0>=1  0
		 for(int i=num; i>=1; i--)
		 {
			 fact=fact*i;               //720
			   //720
		 }
		 System.out.println(fact);
		 
	}
}
