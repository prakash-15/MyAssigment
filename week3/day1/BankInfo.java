package week3.day1;

public class BankInfo {
	
	public void saving() {
		
		System.out.println("Interest rate is: 4%");
	}
	
	public void fixed() {
		
		System.out.println("Interest rate is: 6.5%");
	}
	
	public void deposit() {
		
		System.out.println("Deposted amount is: 10,000");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo info=new BankInfo();
		info.saving();
		info.fixed();
		info.deposit();
	}

}
