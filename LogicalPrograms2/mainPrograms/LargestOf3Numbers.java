package mainPrograms;

import java.util.Scanner;

public class LargestOf3Numbers 
{

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("enter first number: ");
		 int a = sc.nextInt();
		 
		 System.out.print("enter second number: ");
		 int b = sc.nextInt(); 
		 
		 System.out.print("enter third number: ");
		 int c = sc.nextInt();
		 
		 if(a>b && a>c)  
		 {
			 System.out.println(a+" : a is the largest number");
		 }
		 else if (b>a && b>c)
		 {
			 System.out.println(b+" : b is the largest number");
		 }
		 else
		 {
			 System.out.println(c+" : c is the largest number");
		 }
		 sc.close();
	}

}
