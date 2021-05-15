package java_hw4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class hw4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double n = keyboard.nextDouble(); 
		double[] guess = new double[2];
		guess[0] = n/2;
		guess[1] = guess[0];  // special method for checking purpose
		double diff;
		DecimalFormat decimal = new DecimalFormat("#.##");
		
		do{
			double r = n / guess[0];
			guess[0] = (guess[0] + r) / 2;
			diff = (guess[1] - guess[0]) / guess[1] ;
			guess[1] = guess[0];
		}while(Math.abs(diff) > 0.01);
		
		System.out.printf(decimal.format(guess[0]));
	}
}
