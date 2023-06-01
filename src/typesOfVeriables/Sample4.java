package typesOfVeriables;

public class Sample4 {
	
    // example of non-static globle variable.
	int a = 100;    // globle variable.
	           
	public static void main(String[] args) {
		 
		// non-static globle variable call fron same class
		Sample4 s4 = new Sample4();
		System.out.println(s4.a);
		
		// non-static globle variable call fron diff class
		System.out.println(Sample5.d);
		
		// method call from same class
		m1();
        s4.m2();
        
	}
	
	public static void m1()
	{
		Sample4 s4 = new Sample4();
		System.out.println(s4.a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
	

}
