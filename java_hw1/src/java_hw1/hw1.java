package java_hw1;

public class hw1 {
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
		{
			char a=args[i].charAt(0);
			String add = "ay";
			switch(a)
			{
			 case 'a':
			 case 'e':
			 case 'i':
			 case 'o':
			 case 'u':
				 args[i]=args[i]+ add;
				 break;
			default:
			 {
				String s = args[i].charAt(0) + add;
				args[i]=args[i].substring(1) + s;
				break;
			 }
			}
			args[i]=args[i].substring(0,1).toUpperCase()+args[i].substring(1);
			System.out.printf("%s ",args[i]);
		}
	}
}