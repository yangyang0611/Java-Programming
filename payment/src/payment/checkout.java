package payment;

public class checkout {
	public static void main(String[] args) {
		payment a = new payment();
		a.pay();
		//payProcess(a);
	
		creditCard b = new creditCard();
		b.pay();
		///payProcess(b);
		
		payment c = new creditCard();
		c.pay();
		//payProcess(c);
		
		//public static void payProcess(payment p){
		//	if(p instanceof creditCard) {
		//		((creditCard)p).sign();
		//	}
		//}
	}
}
