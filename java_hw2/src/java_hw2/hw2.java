package java_hw2;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class hw2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		String d = keyboard.next();
		DecimalFormat pattern = new DecimalFormat(d);
		
		double judge =Math.sqrt (Math.pow(b, 2) - (4*a*c) );
		if(judge>0) {
			double result1 = (-1*b + judge) / (2*a);
			double result2 = (-1*b - judge) / (2*a);
			if(a>0) {
				if(result1 > result2) {
						System.out.println(pattern.format(result1));
						System.out.printf(pattern.format(result2));
					}
					else {
						System.out.println(pattern.format(result2));
						System.out.printf(pattern.format(result1));
					}
				}
			else {
				if(result1 > result2) {
					System.out.println(pattern.format(result2));
					System.out.printf(pattern.format(result1));
				}
				else {
					System.out.println(pattern.format(result1));
					System.out.printf(pattern.format(result2));
				}					
			}
		}
		else
			System.out.println("no ans");
	}
}
