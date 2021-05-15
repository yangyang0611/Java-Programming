package fianl2;


public class ques2 {
	public static void main(String[] args) {
		/*Scanner keyboard= new Scanner(System.in);
		String input1 = keyboard.nextLine();
		String input2 = keyboard.nextLine();
		int a=0,b=0;
		
		//if(args.length == 2) if(args[0].length() == args[1].length()) {
		if(input1.length() == input2.length()) {
			for(int i=0; i < input1.length() ; i++) {
				for(int j=0; j< input2.length(); j++) {
					if(input1.charAt(i) == input2.charAt(j) && i==j)
						a++;
					if(input1.charAt(i) == input2.charAt(j) && 	i!=j)
						b++;
				}
			}
		}
		
		System.out.println(a + "A" + b + "B");*/
		
		int a=0,b=0;
		
		if(args.length ==2) {
		if(args[0].length() == args[1].length()) {
	
		for(int i=0; i < args[0].length() ; i++) {
			for(int j=0; j< args[1].length(); j++) {
				if(args[0].charAt(i) == args[1].charAt(j) && i==j)
					a++;
				if(args[0].charAt(i) == args[1].charAt(j) && i!=j)
					b++;
				}
			}
		}
	}

	System.out.println(a + "A" + b + "B");
	}
}
