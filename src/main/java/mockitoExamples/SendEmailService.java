package mockitoExamples;


public class SendEmailService {
	
	private WayToSend waytoSend;
	
	public void sendEmail(String emailAddress, String message, boolean htmlFormat) {
		Email email = null;
		
		if(htmlFormat) {
			email = new Email(emailAddress, message, FormatEmail.HTML);
		}else {
			email = new Email(emailAddress, message, FormatEmail.TEXTO);
		}
		waytoSend.sendEmail(email);
	}
	

}
