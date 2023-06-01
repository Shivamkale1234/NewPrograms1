package typesOfVeriables;

public class Sample1 {
	
	
	// example on local and globle variable
	
	int a = 10;   //globle variable
	
	public void m1() {
		
		int b = 20;   //local variable
		System.out.println(b);
		System.out.println(a);
	}
	
    public void m2() {
		
		int c = 40;   //local variable
		System.out.println(c);
		System.out.println(a);
	}
    
    public static void main(String[] args) {
    	
    	Sample1 s1 = new Sample1();
    	s1.m1();
    	s1.m2();
	}

}
