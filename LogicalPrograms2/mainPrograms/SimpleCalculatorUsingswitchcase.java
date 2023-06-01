package mainPrograms;

public class SimpleCalculatorUsingswitchcase {

	public static void main(String[] args) {
		
		double a=10;
		double b=20;
		double sum;
		char operator = '+';
		
		System.out.println("the numbers are defined as "+a+" and "+b);
		System.out.println("the operator is defined as "+ operator);
		
		switch(operator)
		{
		case '+':
			sum=a + b;
			System.out.println(a + " + " + b + " = " + sum);
			break;
		case '-':
			sum=a - b;
			System.out.println(a + " - " + b + " = " + sum);
			break;
		case '*':
			sum=a * b;
			System.out.println(a + " * " + b + " = " + sum);
			break;
		case '%':
			sum=a % b;
			System.out.println(a + " % " + b + " = " + sum);
			break;
		case '/':
			sum=a / b;
			System.out.println(a + " / " + b + " = " + sum);
			break;
		}
	}
}
//the numbers are defined as 20.2 and 10.2
//the operator is defined as +
//20.2 + 10.2 = 30.4
