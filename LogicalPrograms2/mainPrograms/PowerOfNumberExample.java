package mainPrograms;

public class PowerOfNumberExample {

	public static void main(String args[])  
	{  
	
	int num=5;
	int power=3;
	
		System.out.println("Enter the base: "+num);  
		System.out.println("Enter the exponent: "+power);
		
	double sum = Math.pow(num, power);  
	 
	System.out.println(num +" to the power " +power + " is: "+ sum);  
	}  
}
//5*5*5=125
//5*5*5*5=625
//5*5*5*5*5=3125
/*
 * 5 is 3 times calculate (5*5*5=125)
 */
