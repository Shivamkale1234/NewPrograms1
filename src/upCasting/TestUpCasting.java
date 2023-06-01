package upCasting;

public class TestUpCasting {

	public static void main(String[] args)
	{		
		//create  object of sub class with reference/ datatype of super class

		Father s= new Son();
		s.car();
		s.money();
		s.home();
		//s.bike();

	}

}
