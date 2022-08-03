package threadingPractice;
import java.util.concurrent.atomic.AtomicInteger;

public class SyncDoubts implements Runnable{
	AtomicInteger threadId = new AtomicInteger();
	
	public synchronized void MethodA() throws InterruptedException {
		
		System.out.println("Hello from A");
		Thread.sleep(10000);
	}
	
	public void MethodB() {
		
		System.out.println("Hello from B");
	}
	
//	public SyncDoubts(int id) {
//		this.threadId = id;
//	}
	
	public static void main(String[] args) {
		
		SyncDoubts obj = new SyncDoubts();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();

	}

	@Override
	public void run() {
		
		threadId.addAndGet(1);
		//System.out.println(threadId);
		System.out.println(Thread.currentThread().getId());
		if(Thread.currentThread().getId() == 13) {
			try {
				this.MethodA();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(Thread.currentThread().getId() == 14) {
			this.MethodB();
		}
	}

}
