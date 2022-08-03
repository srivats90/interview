package leetCodeIntermediate;

import java.util.*;

public class SubstringwithConcatenationofAllWords {

	public static void find(String str, String[] words){
		
		List<Integer> result = new ArrayList<>();
		Map<String, Integer> freqMap = new HashMap<>();
		
		for(String word : words) {
			freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);		
		}
		int eachWordLength = words[0].length();
		int totalWords = words.length;
		for(int i=0 ; i < str.length() - words.length*words[0].length() ; i++) {
			
			Map<String, Integer> seenWords = new HashMap<>();
			
			for(int j = 0; j < totalWords ; j++) {
				
				int wordIndex = i + j * eachWordLength;
				String word = str.substring(wordIndex, wordIndex + eachWordLength);
				
				seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
				
				if(!freqMap.containsKey(word))
					break;
				
				if(seenWords.get(word) > freqMap.get(word))
					break;
				
				if(j + 1 == totalWords) {
					result.add(i);
				}
			}
		}
		
		System.out.println(result.toString()); 
	}
	
	public static void main(String[] args) {

		find("capmapcap", new String[] {"cap","map"});
		
	}

}
