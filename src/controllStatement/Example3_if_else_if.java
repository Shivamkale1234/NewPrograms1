package controllStatement;

public class Example3_if_else_if {

	public static void main(String[] args) {
		 
		int marks = 85;
		
		if(marks>=80)
		{
			System.out.println("distinction pass");
		}
		else if(marks>=65  & marks<=80)
		{
			System.out.println("1st class pass");
		}
		else if(marks>=50  & marks<=65)
		{
			System.out.println("2nd class pass");
		}
		else if(marks>=35  & marks<=50)
		{
			System.out.println("3rd class pass");
		}
		else if(marks<=35)
		{
			System.out.println("fail");
		}

	}

}
