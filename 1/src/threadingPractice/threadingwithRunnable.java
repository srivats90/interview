package threadingPractice;

public class threadingwithRunnable {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		new Cat();

	}

}

class Cat implements Runnable {

	@Override
	public void run() {
		System.out.println("Cat");
		
	}
	
	public Cat() {
		new Thread(this).start();
	}
	
}