package frequentlyasked;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Dog dog = new Dog();
		
		service.submit(dog);
		service.submit(dog);
		
		service.shutdown();

	}

}
