package methods;

public class Sample7 {

	public static void main(String[] args) {
		 
		// 1 : static method call from same class
		m3();
		
		// 2 : static method call from diff class
		Sample3.m3();
		
		// 3 : non-static method call from same class
		Sample7 s7 = new Sample7();
		s7.m7();
		Sample8.m2();
		
		// 4 : non-static method call from diff class
		Sample8 s8 = new Sample8();
		s8.m4();

	}
	
    public static void m3() {
		
		System.out.println("running ststic method m3");
		
	}
    
    public void m7() {
		
		System.out.println("running ststic method m4");
		
	}

	 

}
