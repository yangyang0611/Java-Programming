package chp6_pg12;

public class cat {
	int age = 1;
	public static void main(String[] args) {
		cat cat1 = new cat();
		cat cat2 = cat1;
		cat1.age=2;
				
		System.out.println(cat2.age);		
	}
}
