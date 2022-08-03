package Stringprobs;

import java.util.*;

public class VariableOperations {

	public static int varOper(String[] arr) {
		
		int sum = 0;
	//	List<String> list = new ArrayList<>(Arrays.asList("X++","++X","--X"));
		List<String> list = new ArrayList<>(List.of("X++","++X","--X"));

		for(String oper : list) {
			if(oper.charAt(1) == '+')
				sum++;
			else
				sum--;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		String[] input = {"X++","++X","--X","X--"};
		System.out.println("Sum " + VariableOperations.varOper(input));
	}

}
