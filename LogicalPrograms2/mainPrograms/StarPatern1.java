package mainPrograms;

public class StarPatern1 {
	
	public static void main(String args[])
	{
		 
		System.out.println("my number is between * to ***** ");
		
	    int a=1;
	    int c = 0;
	    
		for(a=1; a<=5; ++a )  // (b=1; b<=5; --b)
			                  // this is the output is infinite numbers
	    { 
			System.out.println(a);
			c++;
		}
		System.out.println(c);
	}
}
