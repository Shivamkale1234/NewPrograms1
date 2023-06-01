package mainPrograms;

public class ReversenumberEx1 {
	
	public static void main(String[] args)   
	{  
	int number = 1234, reverse = 0, remainder;  
	while(number != 0)   
	{  
	remainder = number % 10;             // 4, 3, 2, 1
	reverse = reverse * 10 + remainder;  // 4, 43, 432, 4321
	number = number/10;                  // 123, 12, 1, 0
	}  
	System.out.println("The reverse condition is: " + reverse);  
	}  
}
/*
number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4  = 4
number = 1234 / 10 = 123

Iteration 2:

number = 123
remainder = 123 % 10 = 3
reverse = 4 * 10 + 3 = 40 + 3 = 43
number = 123 / 10 = 12

Iteration 3:

number = 12
remainder = 12 % 10 = 2
reverse = 43 * 10 + 2 = 430 + 2 = 432
number = 12 / 10 = 1

Iteration 4:

number = 1
remainder = 1 % 10 = 1
reverse = 432 * 10 + 1 = 4320 + 1 = 4321
number = 1 / 10 = 0
*/
