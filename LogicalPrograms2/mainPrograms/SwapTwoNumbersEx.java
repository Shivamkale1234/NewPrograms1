package mainPrograms;

public class SwapTwoNumbersEx {

	public static void main(String[] args) {
		
		int x=10; 
		int y=20; 
		int t;

		System.out.println("enter the value of x and y");
		
		System.out.println("before swaping number: "+ x +" and "+ y);
		/* swapping */ 
		t=x;
	    x=y;
	    y=t;
	    
	    System.out.println("after swaping number: "+ x +" and "+ y);
	    
	}   

}
