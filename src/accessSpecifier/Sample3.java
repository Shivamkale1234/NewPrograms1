package accessSpecifier;

public class Sample3 {
	
	    //example2: of default access specifier

		int b;             //default --> access specifier

		Sample3()          //default --> access specifier
		{
			b=20;
		}

		void printCubeOfNum()     //default --> access specifier
		{
			System.out.println(b*b*b);
		}


		 public static void main(String[] args) 
		 {

			 Sample3 s2=new Sample3();
			 s2.printCubeOfNum();
			 System.out.println(s2.b);		 
		}

}
