
public class main {
	public static void main() {
		System.out.println(Shape.color);
		
		Shape shape1 = new Rectangle();
		print(shape1);
		Shape shape2 = new circle();
		print(shape2);
	}
	
	public static void print(Shape shape) {
		System.out.println(shape.area());
	}
}
