package mockitoExamples;

public class Email {
	 	
		private String emailAddress;

	    private String message;

	    private FormatEmail format;

	    public Email(String emailAddress, String message, FormatEmail format) {
	        this.emailAddress = emailAddress;
	        this.message = message;
	        this.format = format;
	    }

	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public FormatEmail getFormat() {
	        return format;
	    }
}
