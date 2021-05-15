package fianl1;

import java.util.Scanner;

public class kite {
	public static void main(String[] args) {
		/*for(int i=0; i<= 5; i++){
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
	for(int i=5; i> 0; i--){
		for(int j=i; j>0; j--) {
			System.out.print("*");
		}
		System.out.println("");
	}
	System.out.println("");*/
		/*Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(); 
	
	for(int i=1; i<=input; i++) {           //input=9
		for(int j=1; j<=input; j++) {       //j=9
			if(i == (input+1)/2)
				System.out.print("*");
			else if(j == input-i+1)
				System.out.print("*");
			else if(j == (input+1)/2)
				System.out.print("*");
			else 
				System.out.print(" ");
			
		}
		System.out.println("");
	}*/
		for(int i=0; i< args.length;i++) {
			System.out.print(args[i] + " ");
		}
}
}
