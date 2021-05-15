package chp_pg62;

public class static_test {
	public static void main(String[] args) {
		int sum = Tool.add(1,1);
		System.out.println(sum);
		
		static_test st = new static_test();
		sum = Tool.add2(2,2);
		System.out.println(sum);
	}
}