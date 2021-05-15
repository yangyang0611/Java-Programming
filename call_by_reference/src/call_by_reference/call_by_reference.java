package call_by_reference;

public class call_by_reference {
	public static void main(String[] args) {
		toyClass toy = new toyClass("Tom", 10);
		System.out.println(toy);
		System.out.println(toy.toSting());
		
		change(toy);
		System.out.println(toy);
		System.out.println(toy.toSting());
	}
	
	public static void change(toyClass toy2) {
		toy2.set("Lisa", 18);
		System.out.println(toy2);
	}
}
