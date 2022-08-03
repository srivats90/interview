package random;

import java.util.concurrent.*;

public class Threading {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0; i< 10; i++) {
			Future fut = service.submit(new Broker());
			System.out.println(fut.get());
		}
		
		service.shutdown();

	}

}

class Broker implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Hello");
		return 1;
	}


	
}