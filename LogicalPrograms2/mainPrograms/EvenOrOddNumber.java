package mainPrograms;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		
		int num = 20;
		
		String evenodd = (num%2==0) ? "even" : "odd";
		
		System.out.println(num + " is " + evenodd);
	}
}


