package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsPractice {

	public static void main(String[] args) {

		List<String> list = List.of("Krishna", "Kumar", "Goms", "Sash");

		list.forEach((s) -> {
	//		System.out.println(s);
		});

		System.out.println(list.stream().filter((s) -> s.contains("z")).count());
		
	//	list.stream().filter(s -> s.contains("K")).forEach(i -> System.out.println(i));
	//	list.stream().sorted().forEach(System.out::println);
		
	//	list.stream().map(String::toLowerCase).forEach(System.out::println);

		int sum = IntStream.range(1, 5).sum();
		System.out.println(sum);
		
		Map<Character, Character> map = new HashMap<>();
		
	//	Stream<String[]> str = Stream.of(new String[] {"Krishna", "Kumar", "Goms"});
		
	//	map = str.stream().collect(Collectors.toMap( p -> p[0], p -> p[0]));
	}

}

