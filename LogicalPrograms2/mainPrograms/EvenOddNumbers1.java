package mainPrograms;

public class EvenOddNumbers1 
{
   public static void main(String[] args) 
   {
	   int num = 12345;
	   
	   int evencount=0;
	   int oddcount=0;
	   
	        
	   while(num>0) 
	   {             
		           
		   int rem = num%10;    
		   
		   if(rem%2==0)
		   {
			   evencount++;
		   }
		   else
		   {
			   oddcount++;
		   }
		   num = num/10; //12
		   
	   }
	   System.out.println("even number count: "+ evencount);
	   System.out.println("odd number count: "+ oddcount);
   }
}
