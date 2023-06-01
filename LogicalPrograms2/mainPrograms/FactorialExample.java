package mainPrograms;

public class FactorialExample {
	
	public static void main(String[] args) {
		   
		int num = 5;
		int fact=1;
	    
		for(int i=1; i<=num; i++)      
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+ num + " is " + fact);
	}	
}

















/*5! = 1*2*3*4*5 1*1=1
 *               1*2=2
 *               2*3=6  
 *               6*4=24
 *              24*5=120*/
   
