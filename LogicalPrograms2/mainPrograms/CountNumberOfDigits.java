package mainPrograms;

public class CountNumberOfDigits 
{

	public static void main(String[] args) 
	{
		 int num = 15912345;
		 int count = 0;
		 
		 while(num>0)
		 {
			 num=num/10;   
			 count++;
			 System.out.println(count);
		 }
		 System.out.println("numbers of digits: "+count);
		 

	}

}
