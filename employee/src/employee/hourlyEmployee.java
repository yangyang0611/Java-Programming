package employee;
import java.util.Date;

public class hourlyEmployee extends employee{
	private double wages;
	
	public hourlyEmployee(String theName, Date theDate, double Money) {
		super(theName,theDate);
		wages = Money;
	}
	
	public String getName() {
		return "name is: " + super.getName();
	}
}
