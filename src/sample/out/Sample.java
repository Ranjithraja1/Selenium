package sample.out;

public class Sample extends EmployeeDetails {

	private void companyName() {
 System.out.println("Company name : HCL");
	}
	
	public static void main(String[] args) {
		
	   Sample s= new Sample();
	   s.companyName();
	   s.employeeId();
	   s.employeeName();
	   s.employeeRegNo();
	}
}
