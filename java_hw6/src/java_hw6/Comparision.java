package java_hw6;

public class Comparision implements IOperation{
	private String operator; 
	
	public Comparision(String s) {
		operator = s;
	}
	
	public String perform( String num1, String num2) {
		
		String a = "", b = "";
		char[] char_num1 = num1.toCharArray();
		char[] char_num2 = num2.toCharArray();
		
		 if(num1.charAt(0)=='-' && num2.charAt(0)!='-') {
			 a = "small";
			 b = "big";
		 }
		 else if(num1.charAt(0)!='-' && num2.charAt(0)=='-') {
			 a = "big";
				b = "small";
		 }
		 else if(num1.charAt(0)=='-' && num2.charAt(0)=='-') {
			 String temp = num1;                                   // reverse to get biggest = num1, smallest = num2
				num1 = num2;
			 	num2 = temp;
			 	num1 = num1.substring(1);
			 	num2 = num2.substring(1);
		 }
		
		if(operator.equals(">")) {
			if(a.equals("big"))
				return "true";
			else if(a.equals("small"))
				return "false";
			else if(num1.length() > num2.length())
				return "true";
			else if(num1.length() == num2.length()) {
				for(int i=0; i<num1.length(); i++) {
					if(char_num1[i] > char_num2[i])
						return "true";
					else
						break;
				}
			}
		}
		
		if(operator.equals("<")) {
			if(b.equals("big"))
				return "true";
			else if(b.equals("small"))
				return "false";
			else if(num1.length() < num2.length())
				return "true";
			else if(num1.length() == num2.length()) {
				for(int i=0; i<num1.length(); i++) {
					if(char_num1[i] < char_num2[i])
						return "true";
					else
						break;
				}
			}
		}
		
		if(operator.equals("=")) {
			if(num1.equals(num2)) {
				return "true";
			}
		}
		return "false";
		
	}
}
