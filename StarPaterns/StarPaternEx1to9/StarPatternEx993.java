package StarPaternEx1to9;

public class StarPatternEx993 {

	public static void main(String[] args) {
		
		int i,j, n=5;
		
		for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                if( j==1 || j==i || i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
	}
}
