package java_hw5;

public class email extends document{
	private String sender;
	private String recipient;
	private String title;
	
	public String toString() {
		return "From: " + sender + "\nTo: " + recipient + "\nTitle: " + title + "\n"  + super.toString();
	}
	
	public void setSender(String newSender) {          // mutator method    
		sender = newSender;
	}
	
	public String getSender() {                        // access method
		return sender;
	}
	
	public void setRecipient(String newRecipient) {
		recipient = newRecipient;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setTitle(String newTitle) {
		title = newTitle;
	}
	
	public String getTitle() {
		return title;
	}
}
