package This_Super_Keywords;

public class Sample1 extends Sample2{
		 
		//int a=30;       //global variable from super class

		int a=20;         //global  variable from same class

		public void m1() 
		{
			int a=10;       //local variable
			System.out.println(a);       //10
			System.out.println(this.a);	  //20	
			System.out.println(super.a);   //30
		}


		public static void main(String[] args)
		{

			Sample1 s1=new Sample1();
			s1.m1();

		}

}
