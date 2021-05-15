package java_hw3;

import java.util.Scanner;
public class hw3 {
	
	static int max(int b, int c) {
		while(b%c == 0)
		b = b/c;
		return b;
	}
	
	static int Ugly(int no)
	{
		no = max(no, 2); 
	    no = max(no, 3); 
		no = max(no, 5); 
		    
		  return (no == 1)? 1 : 0; 
	}
	
	static int NthUglyNo(int n) 
	{ 
	  int i = 1;  
	  int count = 1;
	  while (n > count) 
	  { 
	    i++;       
	    if (Ugly(i) == 1) 
	      count++;  
	  } 
	  return i; 
	} 
	
	public static void main(String[] avgs) {
		Scanner keyboard = new Scanner(System.in);
		String imput = keyboard.next();
		int judge = Integer.parseInt(imput.substring(2));
		
		if(imput.charAt(0) == 'X')
		{
			
			if(Ugly(judge) == 1)
				System.out.println("true");
			else
				System.out.println("false");
		}
		else if(imput.charAt(0) == 'Y')
		{
			int no =  NthUglyNo(judge); 
			System.out.printf("%d",no);
		}
			
	}
}