package mockitoExamples;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class BankAccountTest {
	
	@Spy
	private BankAccount bankAcc = new BankAccount(1000) ;
	
	@Test
	void verifyCalledOrder() {
		
		bankAcc.payBill(300);
		
		InOrder inOrder = Mockito.inOrder(bankAcc);
		inOrder.verify(bankAcc).payBill(300);
		inOrder.verify(bankAcc).verifyBalance(300);
		inOrder.verify(bankAcc).debit(300);
		inOrder.verify(bankAcc).sendCreditTo(300);
		
	}
	
	@Test
	void verifyNumberOfCalls() {
		
		bankAcc.verifyBalance(300);
		bankAcc.verifyBalance(500);
		bankAcc.verifyBalance(600);
		
		
		Mockito.verify(bankAcc, Mockito.times(3)).verifyBalance(ArgumentMatchers.anyInt());
		
	}
}
