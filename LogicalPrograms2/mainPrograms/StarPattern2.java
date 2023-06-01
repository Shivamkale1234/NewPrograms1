package mainPrograms;

public class StarPattern2 {
	
	public static void main(String args[])
	{
		
        System.out.println("*** Star Pattern ***");
		
		int row=10;
		int column=5;

	     for(int x=1; x<=row; x++)
	     {
	    	 for(int y=1; y<=column; y++) 
		     {
	    		 System.out.print(" * ");
		     }
	    	 System.out.println();
			 
	     }	
		 
	}

}
