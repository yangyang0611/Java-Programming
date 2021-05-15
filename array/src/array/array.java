package array;

public class array {
	public static void main(String[] args) {
		String[] name = new String[3];
		System.out.println(name[0]);
		
		name[0] = "Apple";
		System.out.println(name[0]);	
	
		message(name);
		System.out.println(name[0]);	
	}
	
	public static void message(String[] mess) {
		System.out.println(mess[0]);
		mess[0] = "Banana";
	}
}
