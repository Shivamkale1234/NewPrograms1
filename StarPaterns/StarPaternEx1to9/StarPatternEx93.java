package StarPaternEx1to9;

public class StarPatternEx93 {
	
	public static void main(String[] args) {
		
        int i,j,k,row=5;
        
        for(i=1; i<=row; i++)
        {
        	for(j=1; j<=i; j++)
        	{
        		System.out.print(" ");
        	}
        	for(k=5; k>=i; k--)
        	{
        		System.out.print(" *");
        	}
        	System.out.println();
        }
        for(i=2; i<=5; i++)
        {
      	 
        	for(j=5; j>=i; j--)
      	 
        	{
      		 System.out.print(" ");
      	
        	}
      	 
        	for(k=1; k<=i; k++)
      	 
        	{
      		 System.out.print(" *");
      	 
        	}
      	   System.out.println();
  
        }
		
		
	}

}
