package mainPrograms;

public class SumOfNaturalNumber1 {

	public static void main(String[] args) {
		
		int num =6, sum=0;
		
		for(int i=1; i<=num; i++)
		{                      
			sum=sum+i;    
		}
		System.out.println("sum of first 10 natural no is = " + sum);

	}

}
/*sum=0+1=1
 *sum=1+2=3
 *sum=3+3=6
 *sum=6+4=10
 *sum=10+5=15
 *sum=15+6=21   
 *sum=21+7=failed
 */