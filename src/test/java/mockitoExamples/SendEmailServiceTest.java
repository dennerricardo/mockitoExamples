package mockitoExamples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SendEmailServiceTest {
	

	@Mock
	private WayToSend wayToSend;

	@InjectMocks
	private SendEmailService sendEmailService ;
	
	@Captor
	private ArgumentCaptor<Email> captor ;
	
	
	@Test
	void verifySentData() {
		String emailAddress = "user@test.com.br";
		String message = "Hello tester";
		boolean isHtml = true;
		
		sendEmailService.sendEmail(emailAddress, message, isHtml);
		
		Mockito.verify(wayToSend).sendEmail(captor.capture());
		
		Email emailCatch = captor.getValue();
		
		Assertions.assertEquals(emailAddress, emailCatch.getEmailAddress());
		Assertions.assertEquals(message, emailCatch.getMessage());
		Assertions.assertEquals(FormatEmail.HTML, emailCatch.getFormat());
	}
}
