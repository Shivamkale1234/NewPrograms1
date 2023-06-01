package mainPrograms;

public class CountingDigitsInInteger {

	public static void main(String[] args) {
		
			int c = 0;
			
			int totalnum = 12345;
			
			while(totalnum!=0)
			{
				totalnum=totalnum/10;
				c++;
			}
			
			System.out.println("Total Number of digits are:- "+ c);
		}
} 
//Enter number :: 
//12345
//Number of digits are :: 5


