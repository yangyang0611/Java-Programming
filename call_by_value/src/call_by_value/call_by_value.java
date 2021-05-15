package call_by_value;

public class call_by_value {
	public static void main(String[] args) {
		int speed = 50;
		System.out.println(speed);
		
		change(speed);
		System.out.println(speed);
	}
	
	public static void change(int speeds) {
		speeds = 100;
		System.out.println(speeds);
	}
}
