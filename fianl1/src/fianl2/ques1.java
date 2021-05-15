package fianl2;

import java.util.Scanner;
import java.math.*;
public class ques1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input1 = keyboard.nextInt();
		int input2 = keyboard.nextInt();
		int[] input3 = new int[input1];
		int sum=0;
		
		for(int i=0; i< input1; i++) {
			input3[i] = keyboard.nextInt();
		}
		
		for(int i=0; i< input1; i++) {
			sum = (int) (sum + Math.pow(input3[i], input2));   // pow(num,sqr_times)
		}
		
		System.out.println("ans is " + sum);
		keyboard.close();
	}
}
