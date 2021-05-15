package employee;
import java.util.Date;

public class compare {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		employee a = new employee("Lisa", new Date(114,0,1));
		employee b = new employee("Lisa", new Date(114,0,1));
		//employee C = new hourlyEmployee("Lisa", new Date(114,0,1));
		
		System.out.println(a.equals(b));  // value same
		System.out.println(a == b);       // address not same
		
		if(a instanceof employee) {
			System.out.println(a.getName() + " is an object of employee");
		}
		if(a instanceof hourlyEmployee) {
			System.out.println(a.getName() + " is an object of employee");
		}
		
		System.out.println(a.getClass().getName()); // 得到這個class裏面的基本元素, 這裏求得的是class的name
	} 
}
