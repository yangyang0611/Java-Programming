package classsmate;

public class Email extends Document{
	public String sender;
	public String recipient;
	public String title;

	public Email() {

		super();
	}


	public String toString() {

		String allText="";

		allText += ("From: " + getSender());
                allText += ("\n");
		allText += ("To: " + getRecipient());
                allText += ("\n");
		allText += ("Title: " + getTitle());
                allText += ("\n");

		allText += super.text;

		return allText;

	}


	public void setSender(String Sender) {

		sender = Sender;

	}


	public String getSender() {

		return sender;

	}


	public void setRecipient(String Recipient) {

		recipient = Recipient;

	}


	public String getRecipient() {

		return recipient;

	}


	public void setTitle(String Title) {

		title = Title;

	}


	public String getTitle() {

		return title;

	}
}
