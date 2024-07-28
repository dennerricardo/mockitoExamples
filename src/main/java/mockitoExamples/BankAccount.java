package mockitoExamples;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance; 
	}
	
	public void payBill(int billValue) {
		verifyBalance(billValue);
		debit(billValue);
		sendCreditTo(billValue);
		
	}
	
	public void sendCreditTo(int billValue) {
		// TODO Auto-generated method stub
		
	}
	
	public void debit(int billValue) {
		this.balance = this.balance - billValue;
	}
	
	public void verifyBalance(int billValue) {
		if(billValue > balance) {
			throw new IllegalStateException("insufficient funds");
		}
		
	}
}
