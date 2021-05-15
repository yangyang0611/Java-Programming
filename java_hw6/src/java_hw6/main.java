package java_hw6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOperation operation;
		String result="";
		Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();
		boolean b = false;	
		
		String[] split = line.split(" ");
		String s= split[1];
		if(s.equals("<") || s.equals(">") || s.equals("=")) {
			operation = new Comparision(s);
		    result = operation.perform(split[0],split[2]);
			b = true;
		}
		if(!b) {
			if(s.equals("+")) {
				operation = new Addition();
			    result = operation.perform(split[0],split[2]);
			}
			else if(s.equals("-")) {
				operation = new Substraction();
			    result = operation.perform(split[0],split[2]);
			}
			for(int i=3;i<split.length;i++) {
				if(split[i].equals("+")) {
					operation = new Addition();
				    result = operation.perform(result,split[i+1]);
				}
				else if(split[i].equals("-")) {
					operation = new Substraction();
				    result = operation.perform(result,split[i+1]);
				}
			}
		}
		
		System.out.print(result);
		keyboard.close();
	}

}
