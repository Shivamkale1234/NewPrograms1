package mainPrograms;

public class LargestAmongThreeNumbers {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=12;
		int c=25;
		int temp;
		int largest;
		
		temp    = a>b ? a:b;
		largest = b<c ? c:temp;
		
		System.out.println("the largest value is "+ largest);	
	}
}
