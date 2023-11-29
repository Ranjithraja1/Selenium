package out.sample;

public class CanaraBank {
        
	private static void goldLoan() {
     System.out.println("Gold loan ---------4%");
     
	}
	public static void main(String[] args) {
		goldLoan();
		SbiBank.savings();
        SbiBank.fixed();
        SbiBank.deposite();
        System.out.println(SbiBank.a);
	}
}
