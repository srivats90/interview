package threadingPractice;
import java.util.concurrent.*;
public class ThreadingwithCallable implements Callable<String> {

	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		ThreadingwithCallable obj = new ThreadingwithCallable();
		
		Future<String> f1 = es.submit(obj);
		Future<String> f2 = es.submit(obj);
		
		
		System.out.println(f1.get());
		System.out.println(f2.get());
		
		es.shutdown();

	}

	@Override
	public String call() throws Exception {
		
		return Thread.currentThread().getName();
	}


}
