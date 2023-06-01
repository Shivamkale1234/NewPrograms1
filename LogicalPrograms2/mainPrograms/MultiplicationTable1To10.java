package mainPrograms;

public class MultiplicationTable1To10 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number");
		
		int num = 10;
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(num+" * "+ i + " = " + num*i);
		}
	}
}

