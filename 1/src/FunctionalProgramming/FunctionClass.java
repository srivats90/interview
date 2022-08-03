package FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionClass {

	public static void main(String[] args) {
		
		System.out.println(incrementFunction.apply(1));

		System.out.println((incrementFunction.andThen(multiplyFunction)).apply(1));
		
		System.out.println(addAndMultiply.apply(1, 10));
		
		customerConsumer.accept(new Customer("krish", 30));
		customerBiConsumer.accept(new Customer("Sashwa", 1), false);
		System.out.println(isValidAge.test(50));
		System.out.println(isProperAge.and(isValidAge).test(50));
		System.out.println(isProperAge.or(isValidAge).test(50));

	}

	static Function<Integer,Integer> incrementFunction = a -> ++a;
	
	static Function<Integer,Integer> multiplyFunction = a -> a*10;
	
	static BiFunction<Integer,Integer,Integer> addAndMultiply = (a, b) -> (++a)*(b);
	
	static Consumer<Customer> customerConsumer = customer -> System.out.println(customer.name + customer.age);
	
	static BiConsumer<Customer, Boolean> customerBiConsumer = (customer, showAge) -> System.out.println(customer.name + (showAge?customer.age : "***"));
	
	static Predicate<Integer> isValidAge = age -> age < 100;
	static Predicate<Integer> isProperAge = age -> age != 0;
	
	public static int increment(int a) {
		return a++;
	}
	
}

class Customer {
	public String name;
	public int age;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
}