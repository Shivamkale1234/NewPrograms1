package StarPaternEx1to9;

public class StarPatternEx995 {

	public static void main(String[] args) {
		
       int i,j,k, n=5;
       
       for(i=1; i<=n; i++)
       {
    	   for(j=4; j>=i; j--)
    	   {
    		   System.out.print("  "); 
    	   }
    	   for(k=1; k<=i; k++)
    	   {
    		   if(i==n||k==i||k==1)
                   System.out.print("* ");
               else
                   System.out.print("  ");    		  
    	   }
    	   System.out.println();
       }
        
	}
}
