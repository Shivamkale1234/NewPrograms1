package constructure;

public class Sample1 {

	//DefaultConstructure
	public void m1()
	{
		System.out.println("running method m1 in same class   |");
	}
	
	public static void main(String[] args) {
		 
		// constructor call from same class
		Sample1 s1 = new Sample1();
		s1.m1();  
		
		System.out.println("----------------------------------|");
		
		// constructor call from diff class
		Sample2 s2 = new Sample2();
		s2.m2();
	}

}
