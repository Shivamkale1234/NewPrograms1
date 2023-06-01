package StarPaternEx1to9;

public class StarPatternEx996 {
	
	public static void main(String[] args) {
		
		int i,j,k, n=5;
	       
	       for(i=1; i<=n; i++)
	       {
	    	   for(j=2; j<=i; j++)
	    	   {
	    		   System.out.print("  "); 
	    	   }
	    	   for(k=5; k>=i; k--)
	    	   {
	    		   if(i==1||k==i||k==n)
	                   System.out.print("* ");
	               else
	                   System.out.print("  ");    		  
	    	   }
	    	   System.out.println();
	       }
			
	}

}
