package anonymous;

public class anonymous {
	public static void main(String[] args) {
		anonymous obj = new anonymous();
		obj.Message(new String("is ok"));
		
		String[] name = new String[3];
		System.out.println(name[0]);
		
		double[] a =  new double[3];
		System.out.println(a[0]);
		
		name[0] = "Apple";
		System.out.println(name[0]);		
}
	 /**
	   This method os to show a given mesage
	   @param Message The message to be shown
	  */
	public static void Message(String num) {
		System.out.println(num);
	}
}
