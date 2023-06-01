package mainPrograms;

public class LCMOfTwoNumbers {
	
	public static void main(String[] args) {
		
		
		int num1 = 20, num2 = 50, temp =10, lcm;
		
		for(int i=1; i<=num1 && i<= num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			lcm=i;                
		}
		    lcm=(num1*num2)/temp;                    
		    System.out.printf("the lcm of %d and %d is %d " , num1,num2,lcm);
	}
}
