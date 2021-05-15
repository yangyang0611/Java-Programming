package midterm1;

public class midterm1 {
	public static void main(String[] args) {
		String str = "hi";
		String str1 = new String("hi");
		
		if(str.equals(str1))
			System.out.println("equal");
		else
			System.out.println("not equal");
	
		if(str == str1)
			System.out.println("equal");
		else
			System.out.println("not equal");
	

		System.out.println(str);	
		System.out.println(str1);	
	}
}
