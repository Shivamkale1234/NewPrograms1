package accessSpecifier;

public class Sample6 {
	
	    //example3: protected access specifier

		protected int d;

		protected Sample6()
		{
			d=40;
		}

		protected void printSquareOfNum() 
		{
			System.out.println(d*d);
		}

		public static void main(String[] args) 
		{
			Sample6 s6=new Sample6();
			s6.printSquareOfNum();
			System.out.println(s6.d);	
		}

}
