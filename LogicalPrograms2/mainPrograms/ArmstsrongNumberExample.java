  package mainPrograms;

public class ArmstsrongNumberExample {
/*153: 1cube + 5cube + 3cube = 1 + 125+ 27 = 153 (Armstrong Number)
* 125: 1cube + 2cube + 5cube = 1 + 8 + 125 = 134 (Not an Armstrong Number)
* An Armstrong number is a positive m-digit number 
* that is equal to the sum of the mth powers of their digits.
* It is also known as Armstrong.*/
		
	public static void main(String[] args) {
		 
		int n = 372;
		int num  = n;
		int r, sum=0;
		
		while(n>0)
		{
			 r = n%10;
			 n = n/10;
			 sum = sum + r*r*r;
		}
		
		if(num==sum)
		
			System.out.println("is an Armstrong number");
		else
			System.out.println("is non an Armstrong number");
		
			  
	}
}

/*Enter the limit: Armstrong Number up to 500 are: 
 * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407,
 */

