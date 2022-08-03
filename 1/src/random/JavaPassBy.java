package random;

public class JavaPassBy {
	
	public static void changeName(Dog dog) {
		dog.name = "Goms";
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		changeName(dog);
		
		System.out.println(dog.name);

	}

}

class Dog{
	String name;
	
	Dog(){
		this.name = "Krish";
	}
}