package mainPrograms;

public class ComputeQuadientAndReminderEx1 {
		
		public static void main(String[] args) {
			
			int D = 20,  d = 2;              
			
			int Q = D / d;       //Quotirnt  = 20/2=10
			int R = D % d;       //Remainder = 20&2=0
			
			System.out.println("Quotirnt = " + Q);
			System.out.println("Remainder = " + R);
		}
		/*                    3-- Q
		 *                -------
		 *         D -- 3 // 10-- D
		 *                // 09
		 *                -------
		 *                    1-- R
		 */
	

}
