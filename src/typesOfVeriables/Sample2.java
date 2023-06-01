package typesOfVeriables;

public class Sample2 {
	
	// example of static globle (class variable) variable.
	static int a = 10;    // globle variable.

	public static void main(String[] args) {
		 
		// static globle variable call fron same class
		System.out.println(a);
		
		// static globle variable call fron diff class
		System.out.println(Sample3.c);
	
		// method call from same class
        Sample2 s2 = new Sample2();
        s2.m1();
        m2();
	}
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public static void m2()
	{
		System.out.println(a);
	}

}
