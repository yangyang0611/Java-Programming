package classsmate;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {

		Document document = new Document();
		Email email = new Email();
		File file = new File();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String content;
		String sender, recipient, title, path, keyword;
		String mode = input.nextLine();
		String type = input.nextLine();


		if(type.equals("Document")) 
                {
			content = input.nextLine();
			document.setText(content);

		}

		else if(type.equals("Email"))
		{
			sender = input.nextLine();
			recipient = input.nextLine();
			title = input.nextLine();
			content = input.nextLine();

			email.setSender(sender);
			email.setRecipient(recipient);
			email.setTitle(title);
			email.setText(content);

		}

		else
		{

			path = input.nextLine();
			content = input.nextLine();

			file.setPathname(path);
			file.setText(content);

		}	
	



		if(mode.equals("A")) 
		{

			if(type.equals("Document"))
			{
                           System.out.println(document.toString());
			}

			else if(type.equals("Email"))
			{
			   System.out.println(email.toString());
			}
				
			else if(type.equals("File")) 
			{
 		           System.out.println(file.toString());
 			}

		}


		else if(mode.equals("B"))
                {

			keyword = input.next();

			if (type.equals("Email")) 
			{
			  	if((email.getSender().indexOf(keyword) != -1) || (email.getRecipient().indexOf(keyword) != -1) || (email.getTitle().indexOf(keyword) != -1) || (content.indexOf(keyword) != -1))
			  	{
			    	   System.out.println("true");
		          	}

			   	else
			  	{
			    	   System.out.println("false");
			  	}

			}


	        	else 
      	        	{
		  		if(content.indexOf(keyword) != -1)
		  		{ 
				  System.out.println("true");
	        	        }

		  		else         // 沒有else不能用
				{ 
				  System.out.println("false");
				}
			}
		}


		else 
		{

			if(type.equals("Document"))
			{
				String text = input.nextLine();
				String revise = input.nextLine();

				if(text.equals("text"))
				{
				  document.setText(revise);
				}

				System.out.println(document.toString());

			}


			else if(type.equals("Email"))
			{

				String text = input.nextLine();
				String revise = input.nextLine();

				if(text.equals("text"))
				{
		 		  email.setText(revise);
				}

				else if(text.equals("sender"))
				{
				  email.setSender(revise);
				}
	
				else if(text.equals("recipient"))
				{
				  email.setRecipient(revise);
				}

				else if(text.equals("title"))
				{ 
				  email.setTitle(revise);
				}

				System.out.println(email.toString());

			}


			if(type.equals("File")) 
                        {
				String text = input.nextLine();
				String revise = input.nextLine();

				if(text.equals("text"))
				{
			          file.setText(revise);
				}

				else
				{
				  file.setPathname(revise);
				}

				System.out.println(file.toString());
			
			}
		}
	}
}