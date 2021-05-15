package lab9;

public class question {
	public static void main(String[] args) {
		final int a = 5;
		int b = 10;
		final static int c =5;
		print(a,b);
		System.out.println(true+false);
		System.out.println(1 + 5.0F + 5);
	}
	
	static void print(int a, final int b) {
		a++;
		b++;
	}
}
