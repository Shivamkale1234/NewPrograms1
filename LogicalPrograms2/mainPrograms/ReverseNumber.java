package mainPrograms;

public class ReverseNumber {
	
	public static void main(String args[])
	{
		int num=132342;
		int reminder;
		int reverse=0;
		
		while(num>0)
		{
			reminder = num % 10;
			num =num/10;
			reverse =reverse*10 +reminder;
		}
		System.out.println("The reverse given number is :- "+reverse);
	}
	
 //condition
 //no>0       no123   reminder = no%10; no =no/10; reverse = reverse*10+reminder;
 //           123             3            12            r =  0*10+3=3
 //	          12              2            1             r =  3*10+2=32
 //           1               1            0             r = 32*10+1=321
}
