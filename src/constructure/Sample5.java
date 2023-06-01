package constructure;

public class Sample5 {
		 
		//example of user defined constructure with parameter
		//step1: declaration
		int num1;
		int num2;
		
		//step2: initilization
		//user defined constructure ---> provided by user
		
		Sample5 (int a, int b)
		{
			num1=a;
			//local variable info into globle variable
			num2=b;
		}
		
		//step3 usage
		public void add() 
		{
			System.out.println(num1+num2);
		}  
		
		public void mult() 
		{
			System.out.println(num1*num2);
		}
		
		public static void main(String[] args) 
		{
			Sample5 s5 = new Sample5(10,20);
			s5.add();
			s5.mult();
			

	    }

}
