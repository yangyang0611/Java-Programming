package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class lab7 {

	//@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) throws FileNotFoundException {
		int x = 30;
		int y = 2;
		System.out.println( x * y + 9 / 3 );
		System.out.println( x / y * 5 );

		System.out.println( 15.0 / 2);
		System.out.println( 15 / 2 );
		
		int a = 10;
		int b = 3;
		double c = 10/3;
		double d = (double)10/3;
		System.out.println( c );
		System.out.println( d );

		System.out.println(15.0 / 2); 
		System.out.println(15 / 2 );
		
		double price = 19.8; 
		String name = "magic apple";
		System.out.printf("$%6.2f for each %s.%n", price, name);
		System.out.println("Wow"); 
		
		String aString="abc";
		System.out.printf("%4s %n",aString);
		System.out.printf("%3s %n",aString);
		System.out.printf("%2s %n",aString);
		System.out.printf("%s %n",aString);
		int c1=123456789;
		System.out.printf("%3d %n",c1);
		
		System.out.printf("%6.2f %n", 597.7231); 
		
		DecimalFormat percent = new DecimalFormat("0.00%");
		System.out.println(percent.format(0.308));

		Scanner keyboard =new Scanner(System.in);
		//Prompt the user for the first number 
		System.out.print("Enter the first integer: ");
		//Read the input 
		int firstNumber=keyboard.nextInt();
		//Prompt the user for the second number
		System.out.print("Enter the second integer: ");
		//Read the second number 
		int secondNumber=keyboard.nextInt();
		System.out.println(firstNumber+"*"+secondNumber+" is " +firstNumber*secondNumber);
		
		//Scanner scanner = new Scanner(new FileInputStream("d:\\text.txt"));
		//scanner.hasNextLine();
	
		int sum =0;
		for(int i=1;i <=3;i++) { sum +=i; } 
		System.out.println("The total is: "+sum);
		
loop: for(int i=0;i<=10;i++){
			System.out.println("i="+i); 
			for(int j=0;j<=10;j++)
			{
				System.out.println("j="+j);
				break loop;
				}
			}
		
		boolean b1 = false;
		int i= 1;
		do {
			i++;
			b1=!b1;
		}while(b1);
		System.out.println(i);
	
	
	if(true)
	if(false)
	System.out.println("a");
	else
	System.out.println("b");	
	}

	}

