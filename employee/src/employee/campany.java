package employee;
import java.util.Date;

public class campany {
	public static void main(String[] args) {
		hourlyEmployee he = new hourlyEmployee("Tom",new Date(114,0,1),100);
		System.out.println(he.getName());
	}
}
