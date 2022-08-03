package threadingPractice;

public class MySingleton {

	private static volatile MySingleton instance = null;
	
	private MySingleton() {
		
	}
	
	public MySingleton getInstance() {
		if(instance == null) {
			synchronized(MySingleton.class) {
				
				instance = new MySingleton();
			}
		}
		return instance;
	}

}
