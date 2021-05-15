package java_hw6;

public class Substraction implements IOperation{
	public String perform( String num1, String num2) {
		String x,y,z;
		String result = "";
		String sign1 = "";
		String sign2="";
		
		char[] a_char = num1.toCharArray();
		char[] b_char = num2.toCharArray();
		
		if(num1.charAt(0) == '-' && num2.charAt(0) != '-') {   // - +
			//addition
			sign1="-";
			IOperation operation = new Addition();
			String add = operation.perform(num1.substring(1), num2);
			
			//result
			result = sign1+add;
			return result;
			
			
		}
		else if(num1.charAt(0) != '-' && num2.charAt(0) == '-') {   // + -
			//addition
			IOperation operation = new Addition();
			String add = operation.perform(num1, num2.substring(1));
			
			//result
			result = sign1+add;
			return result;
			
		}
		else if(num1.charAt(0) == '-' && num2.charAt(0) == '-'){        //  - - 
			sign1="-";
			num1 = num1.substring(1);
			num2 = num2.substring(1);
		}
		
		IOperation operation = new Comparision("=");
		String comp = operation.perform(num1,num2);
		if(comp.equals("true")) {
			result="0";
			return result;
		}
		else {
			IOperation operation2 = new Comparision(">");
			String comp2 = operation2.perform(num1,num2);
			if(comp2.equals("true")) {
				x=num1;
				y=num2;
			}
			else{
				x=num2;
				y=num1;
				sign2="-";
			}
		}
		
		a_char = x.toCharArray();
		b_char = y.toCharArray();
		
		z=x;
		char[] c_char = z.toCharArray();
		
		int u=0;
		int j=x.length()-1;
		
		for(int i=y.length()-1;i>=0;i--) {
			int a = a_char[j]-'0';
			int b = b_char[i]-'0';
			if(a-b-u<0) {
				c_char[j] = (char) (a-b-u+10+48);
				u=1;
			}
			else {
				c_char[j] = (char) (a-b-u+48);
				u=0;
			}
			
			j--;
		}
		
		
		
		while(u==1) {
			int a = a_char[j]-'0';
			if(a-u<0) {
				c_char[j] = (char) (a-u+10+48);
				u=1;
			}
			else {
				c_char[j] = (char) (a-u+48);
				u=0;
			}
			j--;
		}
		
		int k;
		for(k=0;k<x.length();k++) {
			if(c_char[k]!='0') {
				result = new String(c_char);
				result = result.substring(k);
				break;
			}
		}
		
		if((sign1.equals("-")&&sign2.equals("")) || (sign1.equals("")&&sign2.equals("-"))) {
			result = "-"+result;
		}
		
		return result;
	}
}
