package accessSpecifier;

public class Sample9 {
	
	    //4: example of public access specifier

		public int a;


		public Sample9()
		{
			a=50;
		}

		public void add() 
		{
			System.out.println(a+a);
		}

		public static void main(String[] args)
		{
			Sample9 s9=new Sample9();
			s9.add();
			System.out.println(s9.a);
		}

}
