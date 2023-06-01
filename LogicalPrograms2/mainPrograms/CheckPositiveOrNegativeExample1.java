package mainPrograms;

public class CheckPositiveOrNegativeExample1 {
	
	public static void main(String[] args) {
		
		int num = -10;
		
		if(num>0)  
		{
			System.out.println("the number is positive:- "+ num);
		}
		else if(num<0)   
		{
			System.out.println("the number is negative:- "+ num);
		}
		else
		{
			System.out.println("the number is zero:- "+ num);
		}
	}

}
