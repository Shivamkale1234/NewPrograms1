package mainPrograms;

public class LeapYearEx1 {
	
	 public static void main(String[] args)
	 {
	      int year=2400;
	   	           
	      if(year%400 == 0)
	      {
	    	  System.out.println("leap year1");
	      }
	      else if (year%4 == 0 && year%100!=0)
	      {
	    	   System.out.println("leap year2");
	      }
	      else
	      {
	           System.out.println("not a leap year");
	      }
	 }
}
