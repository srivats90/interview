package random;

import java.util.*;

public class AvoidDuplicatesArrayList {

	public static void main(String[] args) {
		
		List<Animal1> list = new ArrayList<>();
		list.add(new Animal1(1, "Cat"));
		list.add(new Animal1());
		
		if(list.contains(new Animal1())) {
			System.out.println("Contains already");
		}
		
	}

}

class Animal1 {
	int age;
	String name;
	
	Animal1(){
		this.age = 4;
		this.name = "Lion";
	}
	Animal1(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this.age == ((Animal1)o).age  && this.name == ((Animal1)o).name)
		    return true;
		return false;
	}
}
