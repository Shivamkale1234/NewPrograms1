package useOfStaticAndNon_Static;

public class EmpInfo {

	public static void main(String[] args) {
		 
		 Emp e1 = new Emp();
		 e1.empname = "shivam";
		 e1.empid = 101;
		//e1.empceo = "abc";
		 Emp.empceo = "xyz";
		 
		 Emp e2 = new Emp();
		 e2.empname = "shiv";
		 e2.empid = 102;
		 //e1.empceo = "abc";
		 Emp.empceo = "xyz";
		 
		 Emp e3 = new Emp();
		 e3.empname = "shiva";
		 e3.empid = 103;
		 //e1.empceo = "abc";
		 Emp.empceo ="xyz";
		 
		 e1.empdetails();
		 e2.empdetails();
		 e3.empdetails();
		 
	}

}
