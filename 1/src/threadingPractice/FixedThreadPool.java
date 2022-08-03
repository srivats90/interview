package threadingPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPool {

	public static void main(String[] args) {
		
	//	ExecutorService service = Executors.newFixedThreadPool(3);
	//	ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newSingleThreadExecutor();


		for(int i=0 ; i < 5; i++)
		    service.submit(new Cow(i));
		
		service.shutdown();
 
	}

}

class Cow implements Runnable {

	public int threadId;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(threadId + " Tick Tick " + i);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Cow(int id) {
		this.threadId = id;
	}

}