package LeetCodePractice;

import java.util.*;
class ValidParan {
    public static boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i< s.length() ; i++){       
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                char element = '#';
                if(!stack.isEmpty())
                    element = stack.pop();
                if(element != map.get(c))
                    return false;
            }else{
                stack.push(c);
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }   
    
    public static void main(String[] args) {
    	System.out.println(isValid("()[]{}"));
    }
}
