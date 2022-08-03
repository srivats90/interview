package Stringprobs;

public class MaxWords {

	public static int maxWords(String[] arr) {
		int count = 0;
		
		for(String line : arr) {
			int temp = line.split(" ").length;
			String[] tmp = line.split(" ");
			if(tmp.length > count)
				count = tmp.length;
		}
			
		return count;
	}
	
	public static int maxWords1(String[] arr) {
		int count = 0;
		
		for(String line : arr) {
			String tmp = line.replaceAll("[^ ]", "");
			if(tmp.length()+1 > count)
				count = tmp.length()+1;
		}
		
		return count;
	}
	
	public static int maxWords2(String[] arr) {
		int count = 0;
		
		for(String line : arr) {
			int tmp = (int) line.chars().filter(c -> c == (int) ' ').count();
			if(tmp+1 > count)
				count = tmp+1;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println("count is " + MaxWords.maxWords2(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));

	}

}
