package week3.day1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("To Validate if this method is overriden");

	}
	
	public static void main(String[] args) {
		AxisBank Ab=new AxisBank();
		Ab.deposit();
		Ab.fixed();
		Ab.saving();
	}
	
}
