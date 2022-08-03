package frequentlyasked;

public class Threadtest implements Runnable{
	
	public int threadNumber;

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		    System.out.println(i + " thread number is " + threadNumber);
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public int getThreadNumber() {
		return threadNumber;
	}

	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}

}
