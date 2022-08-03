package threadingPractice;

public class threadingwithAnonymousRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello");
				
			}
			
		}).start();
	
	
	new Thread(() -> {

		
			System.out.println("Hello");
			

		
	}).start();
}

}
