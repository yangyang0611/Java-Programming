
public class house {
	public static void main(String[] args) {
		animal dog = new dog(); 
		animal cat = new cat();
		
	playWith(dog); 
	playWith(cat);
	dog.sit(); 
	cat.sit();
	}
	public static void playWith(animal animal){
		animal.run();
	}
}