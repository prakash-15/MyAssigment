package week3.day1;

public class AxisBank extends BankInfo{
	
public void deposit() {
		
		System.out.println("Deposted amount is 5,00,00");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank info = new AxisBank(); 
		info.saving();
		info.fixed();
		info.deposit();
	}

}
