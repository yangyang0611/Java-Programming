public class Racer extends Thread{
	public void run() {
		RaceCondition.increase();
	}
}