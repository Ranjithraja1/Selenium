package out.sample;

import sample.out.EmployeeDetails;

public class ClientDetails extends EmployeeDetails {
     
	private void clientId() {
System.out.println("Client id   : 32323");
	}
	public static void main(String[] args) {
		 
		ClientDetails c=new ClientDetails();
		  c.clientId();
		  c.employeeName();
		  c.employeeId();
		  
	}
}
