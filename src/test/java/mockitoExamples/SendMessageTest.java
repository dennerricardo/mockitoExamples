package mockitoExamples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class SendMessageTest {
	@Spy
	private SendMessage sendMessage;
	
	@Test
	void verifyBehaviorClass() {
		Mockito.verifyNoInteractions(sendMessage);
		Message message = new Message("ARRIVED");
		sendMessage.addMessage(message);
		
		Mockito.verify(sendMessage).addMessage(message);
	
		Assertions.assertFalse(sendMessage.getMessages().isEmpty());
	}
}
