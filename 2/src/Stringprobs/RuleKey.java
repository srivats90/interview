package Stringprobs;

import java.util.*;

//Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], 
//ruleKey = "type", ruleValue = "phone"
//Output: 2
//Explanation: There are only two items matching the given rule, 
//which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. 
//Note that the item ["computer","silver","phone"] does not match.

public class RuleKey {

	public static int rule(String ruleKey, String ruleValue) {
		
		List<String> item1= new ArrayList<>(Arrays.asList("phone","blue","pixel"));
		List<String> item2= new ArrayList<>(Arrays.asList("computer","silver","lenevo"));
		List<String> item3= new ArrayList<>(Arrays.asList("phone","gold","iphone"));
		
		List<List<String>> item = new ArrayList<>();
		List<List<String>> kk = new ArrayList<>(List.of(List.of("phone","blue","pixel"),List.of("computer","silver","lenevo"),List.of("phone","gold","iphone")));
		item.add(item1);
		item.add(item2);
		item.add(item3);
		int count=0;
		for(int i=0; i<kk.size();i++) {
			if(ruleKey == "type")
				if( item.get(i).get(0) == ruleValue)
					count++;
			if(ruleKey == "color")
				if( item.get(i).get(1) == ruleValue)
					count++;
			if(ruleKey == "name")
				if( item.get(i).get(2) == ruleValue)
					count++;
		}
		
		//using equals()
//        for(int i = 0 ;i<items.size();i++){
//            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
//            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
//            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
//        }
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(RuleKey.rule("type", "phone"));
		System.out.println(RuleKey.rule("color", "silver"));

	}

}
