package mainPrograms;

public class PalindromeNumber 
{
	
	public static void main(String[] args) 
	{
		int orgnum = 1321;
		int num = orgnum;    //121
		int rev=0;
		
		while(num!=0)              //condition 121!=0
		{
			int rem = num%10;      //rem=121%10 = 12.1
			rev = rev*10 + rem;    //rev=0*10+1 = 1
			num = num/10;          //num=0/10  = 0
		}
		
		if(orgnum==rev)
		{
			System.out.println(orgnum+":- is an palindrome number");
		}
		else
		{
			System.out.println(orgnum+":- is not an palindrome number");
		}
		 
		
	}

}
