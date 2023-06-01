package StarPaternEx1to9;

public class StarPatternEx997 {

	public static void main(String[] args) {
		
		int i,j,k,n=5;
		
		for (i=1; i<=n; i++)
        {
            
            for (j=n; j>i; j--)
            {
                System.out.print(" ");
            }
           
            for (k=1; k<=(i * 2) -1; k++)
            {
                if( k == 1 || k == (i * 2) -1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
			
				
		}

}
