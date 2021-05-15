package java_hw5;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		document d = new document();
		email e = new email();
		file f = new file();
		Scanner keyboard = new Scanner(System.in);
		String content;
		String mode = keyboard.nextLine();
		String type = keyboard.nextLine();
		
		if(type.equals("Document")) {
			content = keyboard.nextLine();
			d.setText(content);
		}
		
		else if(type.equals("Email")){
			e.setSender(keyboard.nextLine());
			e.setRecipient(keyboard.nextLine());
			e.setTitle(keyboard.nextLine());
			content = keyboard.nextLine();
			e.setText(content);
		}
		
		else {                                       //  type.euqls("File")
			f.setPathname(keyboard.nextLine());
			content = keyboard.nextLine();
			f.setText(content);
		}		
		
		/////////////////////////////////////////////////////////////////////////////////
		
		if(mode.equals("A")) {
			if(type.equals("Document"))
				System.out.println(d.toString());
			else if(type.equals("Email"))
				System.out.println(e.toString());
			else 
				System.out.println(f.toString());
		}
		
		///////////////////////////////////////////////////////////////////////////////
		
		else if(mode.equals("B")){
			String keyword = keyboard.next();
			if(type.equals("Email")) {
				if((e.getSender().indexOf(keyword) != -1) || (e.getRecipient().indexOf(keyword) != -1) || (e.getTitle().indexOf(keyword) != -1) || (content.indexOf(keyword) != -1))
					System.out.println("true");
			else
					System.out.println("false");
			}
			
			else if(type.equals("Document")){               // <method 2>
				if(content.indexOf(keyword) != -1)
					System.out.println("true");
				else
					System.out.println("false");
			}
		
			else if(type.equals("File")) {
				if(f.getPathname().indexOf(keyword) != -1 || content.indexOf(keyword) != -1)
					System.out.println("true");
				else
					System.out.println("false");
			}
		}

		/////////////////////////////////////////////////////////////////////////////
		
		else if (mode.equals("C")){
			if(type.equals("Document")) {
				String text = keyboard.nextLine();
				String change = keyboard.nextLine();
				if(text.equals("text"))
					d.setText(change);
				System.out.println(d.toString());
			}
			
			else if(type.equals("Email")){
				String text = keyboard.nextLine();
				String change = keyboard.nextLine();
				if(text.equals("text"))
					e.setText(change);
				else if(text.equals("sender"))
					e.setSender(change);
				else if(text.equals("recipient"))
					e.setRecipient(change);
				else 
					e.setTitle(change);
				System.out.println(e.toString());
			}
			
			else if(type.equals("File")){
				String text = keyboard.nextLine();
				String change = keyboard.nextLine();
				if(text.equals("text"))
					f.setText(change);
				else
					f.setPathname(change);
				System.out.println(f.toString());
			}
		}
		keyboard.close();
	}
}