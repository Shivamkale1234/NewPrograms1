package methods;

public class Sample4 {

	//non-static method calling from same class
	public static void main(String[] args) 
	{
		 Sample4 s4 = new Sample4();  //classname object = new classname
		 s4.m5();                     //object.methodname();		 
		 s4.m6();                     //object.methodname();
    }
	
	public void m5()    // non-static method 
	{
		System.out.println("running non-static method from same class m5");
	}
		
	
	public void m6()
	{
		System.out.println("running non-static method from same class m6");
	}
}