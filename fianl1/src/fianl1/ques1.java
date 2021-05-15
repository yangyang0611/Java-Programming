package fianl1;

import java.util.Scanner;

public class ques1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(); 
		if(input>1 && input <101) {
			for(int i=0; i<input; i++) {                             //input=5
			for(int j=0; j < 2*input-1; j++) {                   //j=9
				if(i == input - 1)
					System.out.print("*");
				else if(j == input-1-i || j == input-1+i)
					System.out.print("*");
				else 
					System.out.print(".");
			}
			System.out.println("");
		}
		}
		else
			return;
		
		scan.close();
	}
}
