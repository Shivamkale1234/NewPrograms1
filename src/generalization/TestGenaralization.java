package generalization;

public class TestGenaralization {
		
		public static void main(String[] args) 
		{
			System.out.println("---Features of Airtel1 SimCard----");
			Airtel1 a=new Airtel1();
			a.sms();
			a.ac();
			a.data();
			a.newfeatureA();

			System.out.println("---Features of Jio2 SimCard----");
			Jio2 j = new Jio2();
			j.sms();
			j.ac();
			j.data();
			j.newfeatureB();
			

			System.out.println("---Features of VI3 SimCard----");
			VI3 v=new VI3();
			v.sms();
			v.ac();
			v.data();
			v.newfeatureC();
		}
}
