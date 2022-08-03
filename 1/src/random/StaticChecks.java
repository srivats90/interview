package random;

public class StaticChecks {

	public static void display() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		B b = new B();
		b.show();

	}

}

class B extends StaticChecks{
	
	public static void display() {
		System.out.println("Krishna");
	}
	
	public void show() {
	//	B.display();
		
		B b = new B();
		b.display();
	}
}
