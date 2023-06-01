package methods;

public class Sample1 {

	//main method
	public static void main(String[] args) {   //pre-defined in jvm
		 
		//method calling from same class
		
		System.out.println("hi");
		m1();
		m2();
		m2();
		System.out.println("hello");

	}
	
	public static void m1()
	{
		System.out.println("static regular method m1");
	}
	
	public static void m2()
	{
		System.out.println("static regular method m2");
	}

}
