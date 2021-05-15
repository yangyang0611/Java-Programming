package payment;

public class payment {
	public void pay() {
		System.out.println("Pay in cash");
	}
	
	public void checkout() {
		pay();
	}
	
	public void pay1(int a) {
		a=5;
		return a;
	}
}
