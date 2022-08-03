package random;

import java.util.*;

public class ArrayListMiddle {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(List.of(1,5,3,6,9,0));
		
		list.add(2, 8);
		list.remove(0);
		
		list.forEach(s -> System.out.println(s));
	}

}
