package random;

public class Generics {

	public static void main(String[] args) {
		
		Animal<String> animal = new Animal<String>("Goms");
		System.out.println(animal.name);
		System.out.println(animal.getDetails(1, 2));
	}

}

class Animal<T>{
	T name;
	
	Animal(){
		this.name = (T)"krish";
	}
	Animal(T name){
		this.name = name;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	
	public <T, V> V getDetails(T details, V stuffs) {
		return stuffs;
	}
	
}
class Horse<T> extends Animal{




}
