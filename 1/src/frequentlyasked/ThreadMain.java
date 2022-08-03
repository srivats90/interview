package frequentlyasked;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		for (int j = 0; j < 5; j++) {
			Threadtest threadTest = new Threadtest();
			threadTest.setThreadNumber(j);
			Thread mythread = new Thread(threadTest);

			mythread.start();
	//		mythread.join();
			mythread.isAlive();
		}

	}

}
