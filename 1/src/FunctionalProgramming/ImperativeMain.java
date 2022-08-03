package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class ImperativeMain {

	public static void main(String[] args) {

		List<Person> people = List.of(new Person("Krish", Gender.MALE), new Person("Goms", Gender.FEMALE),
				new Person("Sash", Gender.MALE), new Person("Haas", Gender.FEMALE));
		
		List<Person> female = new ArrayList<>();
		
		for(Person p : people) {
			if(p.gender.equals(Gender.FEMALE))
				female.add(p);
		}
		
		//Declarative
		people.stream().filter(p -> p.gender.equals(Gender.FEMALE)).forEach(System.out::println);

	}

	static class Person {
		private final String name;
		private final Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE
	}
}
