package StarPaternEx1to9;

public class StarPatternEx6 {

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
           		 System.out.print("*");
           	 }
           	 System.out.println();
         }
	}
}
