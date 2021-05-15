package chapter12;

public class main {
	public static void main(String[] args) {
		//starts all threads 
		chp12[] racer= new chp12[30000]; 
		for(int i=0;i<30000;i++){
			racer[i] = new chp12(); racer[i].start();
		}
		//waits for all theadsto complete 
		for(int i=0;i<30000;i++){
			try{ racer[i].join(); 
			} 
			catch(InterruptedExceptione) { e.printStackTrace(); } }
		System.out.println("count="+count);
		}
}
