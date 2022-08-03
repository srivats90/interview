package threadingPractice;

import java.util.concurrent.TimeUnit;

public class ThreadWithExtend {

	public static void main(String[] args) {
		
		System.out.println("Main before");
		new Dog();
		new Dog();
		System.out.println("Main after");

	}

}

class Dog extends Thread {
	public int threadId;
	public static int count=0;
	public void run() {
		for(int i=0 ; i< 10 ; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadId + " Tick Tick " + i);
		}
	}
	public Dog() {
		threadId = count++;
		this.start();	
	}
	public Dog(int threadid) {
		this();
		this.threadId = threadid;
	}
}