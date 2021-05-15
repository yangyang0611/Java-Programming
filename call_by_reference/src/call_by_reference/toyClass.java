 package call_by_reference;

public class toyClass {
	private String name;
	private int number;
	
	public toyClass(String initialName, int initialNumber)
	{
		name = initialName;
		number = initialNumber;
	}
	
	public String toSting() {
		return (name + " " + number);
	}

	public void set(String newName, int newNumber) {	
		name = newName;
		number = newNumber;
	}
}
