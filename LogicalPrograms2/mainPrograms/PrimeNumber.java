package mainPrograms;

//natural number > 1 
//which has only 2 factor 1 and itself
//19 => 1 and 19 => prime number
//28 => 1,2,4,7,14,28 not a prime number

public class PrimeNumber {

	public static void main(String[] args) {
		 
		int num = 17;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				   count++;
			}
			if(count==2)
			{	
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not a prime number");
			}
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}
