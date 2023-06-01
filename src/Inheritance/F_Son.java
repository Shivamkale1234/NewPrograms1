package Inheritance;

public class F_Son extends Father1{
	
	public void bike() 
	{
		System.out.println("bike: R15");
	}
	
	public static void main(String[] args) {
		
		F_Son s1 = new F_Son();
		s1.bike();
		s1.car();
		s1.money();
		s1.home();
	}
	
}
