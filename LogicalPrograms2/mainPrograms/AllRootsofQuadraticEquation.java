package mainPrograms;

import java.util.Scanner;

public class AllRootsofQuadraticEquation {             

	public static void main(String[]  args)   
	{  
		double r1,r2;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a, b, and c value: ");  
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double d= (b * b ) - ( 4 * a * c);   
		
		if (d==0)   
		{  
			System.out.println("roots are real or equal");
		    r1=r2 = -b / (2 * a);   
		    System.out.println("R1 = " + r1);
		    System.out.println("R2 = " + r2);  
		}   
		else if (d>0)   
		{  
			System.out.println("roots are real or distinct.");
			r1 = (-b + Math.sqrt(d)) / (2*a);
			r2 = (-b - Math.sqrt(d)) / (2*a);
			System.out.println("R1 = " + r1); 
			System.out.println("R2 = " + r2); 
		}   
		else   
		{  
		    System.out.println("Roots are distinct and imaginary.");
		    double x = -b / (2*a);
		    double y = Math.sqrt(-d) / (2*a);
		    System.out.println("R1=" + x + "+i" + y);
		    System.out.println("R1=" + x + "-i" + y);
		    
		} 
		sc.close();
		 
	}
}
