package Stringprobs;

//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".


public class Goal {
	
	public static String goal(String input) {
		
		input = input.replace("()","o");
		input = input.replace("(al)", "al");
		
		return input;
	}

	public static void main(String[] args) {
		System.out.println(Goal.goal("(al)G(al)()()G"));
	}

}
