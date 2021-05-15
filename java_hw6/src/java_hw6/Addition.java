package java_hw6;

public class Addition implements IOperation{
	public String perform( String num1, String num2) {
		String x,y,z;
		String result;
		String sign = "";
		
		char[] a_char = num1.toCharArray();
		char[] b_char = num2.toCharArray();
		
		
		if(num1.charAt(0)=='-' && num2.charAt(0)!='-') {
			//subtraction
			
			IOperation operation = new Substraction();
			String sub = operation.perform(num1.substring(1), num2);
			//--
			//-+
			if(sub.charAt(0)=='-') {
				sign="-";
				result = sub.substring(1);
			}
			else {
				result = sub;
			}
			
			return result;
			
		}
		else if(num1.charAt(0) != '-' && num2.charAt(0) == '-') {   // + -
			//subtraction
			IOperation operation = new Substraction();
			String sub = operation.perform(num1, num2.substring(1));
			
			result=sub;
			return result;
			
		}
		else if(num1.charAt(0) == '-' && num2.charAt(0) == '-'){        //  - - 
			sign="-";
			num1 = num1.substring(1);
			num2 = num2.substring(1);
		}
		
		
		if(num1.length() >= num2.length()) {
			x=num1;
			y=num2;
		}
		else {
			x=num2;
			y=num1;
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
			if(a+b+u>9) {
				c_char[j] = (char) (a+b+u-10+48);
				u=1;
			}
			else {
				c_char[j] = (char) (a+b+u+48);
				u=0;
			}
			
			j--;
		}
		while(u==1) {
			if(j<0) {
				z = new String(c_char);
				z = "0"+z;
				c_char = z.toCharArray();
				j=0;
				c_char[j] = (char) (u+48);
				break;
			}
			int a = a_char[j]-'0';
			if(a+u>9) {
				c_char[j] = (char) (a+u-10+48);
				u=1;
			}
			else {
				c_char[j] = (char) (a+u+48);
				u=0;
			}
			j--;
		}
		result = new String(c_char);
		result = sign+result;
		
		return result;
	}
}
