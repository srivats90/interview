package random;

public class Anonymous {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("Hello");

		}).start();
		
		Animal<String> animal = new Animal<String>("goms") {
			public String getName() {
				return "krish";
			}
		};

		System.out.println(animal.getName());
	}

}


