package java_hw5;

public class document {
	protected String text;
		
	public String toString() {                // return text content
		return text;
	}
	
	public void setText(String newText) {   // save text content
		text = newText;
	}
	
	/*public document(String newText) {   // use constructor set text also can
		text = newText;
	}*/
}
