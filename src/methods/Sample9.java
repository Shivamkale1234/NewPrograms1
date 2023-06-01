package methods;

public class Sample9 {

	// Ex 6: Method with parameter
	public static void main(String[] args) {
		 
		add(10,20);
		add(59,57);
		add(123,145);
		
		Sample9 s9 = new Sample9();
		s9.sub(10, 5);
		s9.sub(50, 15);
		s9.sub(10, 25);
	
	}
	
	public static void add(int num1,int num2) {
		
		System.out.println(num1+num2);
		
	}
	public void sub(int num3,int num4) {
		
		System.out.println(num3-num4);
		
	}

}
