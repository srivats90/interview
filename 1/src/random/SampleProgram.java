package random;

import java.util.*;
public class SampleProgram {

	public static void main(String[] args) {
		
		String input = "hello/krishn/kumar 200 as-201-launch-sm{-truncated-}";
		
		String[] arr = input.split("[/ ]+");
		
		for(String a : arr) {
			System.out.println(a);
		
		}
	}

}
