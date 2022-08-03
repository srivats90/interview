package Stringprobs;

import java.util.*;

public class RingsAndRods {

	public static int ringsAndRods(String rings) {
//		int count = 0;
//		Map<Integer, String> map = new HashMap<>();
//		int i = 0;
//		while (i < rings.length()) {
//			String sb = null;
//			if (rings.charAt(i) == 'B') {
//				if (map.get(i + 1) != "B") {
//					sb = map.get(i + 1);
//					if (sb != null) {
//						sb += 'B';
//						map.put(i + 1, sb);
//					} else
//						map.put(i + 1, "B");
//				}
//			} else if (rings.charAt(i) == 'R') {
//				if (map.get(i + 1) != "R") {
//					sb = map.get(i + 1);
//					if (sb != null) {
//						sb += 'R';
//						map.put(i + 1, sb);
//					}else
//						map.put(i + 1, "R");
//				}
//			} else if (rings.charAt(i) == 'G') {
//				if (map.get(i + 1) != "G") {
//					sb = map.get(i + 1);
//					if (sb != null) {
//						sb += 'G';
//						map.put(i + 1, sb);
//					}else
//						map.put(i + 1, "G");
//				}
//			}
//			i += 2;
//		}
//		String tmp = null;
//		for (int j = 0; j <= 9; j++) {
//			tmp = map.get(j);
//			if ((tmp != null) && (tmp.length() == 3))
//				count++;
//		}
//		return count;

//		int count = 0;
//		char[] a = new char[rings.length()];
//		a = rings.toCharArray();
//
//		int i = 0;
//		String b = null, r = null, g = null;
//		
////		for(int m=0; m<b.length();m+=2)
////		{
////			if(b.contains(b.substring(i, 2)))
////				b = b.substring(2,b.length());
////		}
////		for(int m=0; m<r.length();m+=2)
////		{
////			if(r.contains(r.substring(i, 2)))
////				r = r.substring(2,r.length());
////		}
////		for(int m=0; m<g.length();m+=2)
////		{
////			if(g.contains(g.substring(i, 2)))
////				g = b.substring(2,g.length());
////		}
//		
//		while (i < rings.length()) {
//			if (rings.charAt(i) == 'B') {
//				if (b != null)
//					b += Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//				else
//					b = Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//			} else if (rings.charAt(i) == 'R') {
//				if (r != null)
//					r += Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//				else
//					r = Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//			}else if (rings.charAt(i) == 'G') {
//				if (g != null)
//					g += Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//				else
//					g = Character.toString(rings.charAt(i)) + Character.toString(rings.charAt(i + 1));
//			}
//			i+=2;		
//		}
//
//		int[] arr = new int[10];
//		int j =0;
//		while(j < b.length()) {
//			int tmp = Integer.parseInt(Character.toString(b.charAt(j+1)));
//			arr[tmp]++;
//			j+=2;
//		}
//		j = 0;
//		while(j < r.length()) {
//			int tmp = Integer.parseInt(Character.toString(r.charAt(j+1)));
//			arr[tmp]++;
//			j+=2;
//		}
//		j = 0;
//		while(j < g.length()) {
//			int tmp = Integer.parseInt(Character.toString(g.charAt(j+1)));
//			arr[tmp]++;
//			j+=2;
//		}
//		
//		for(int k =0; k<arr.length; k++) {
//			if(arr[k] != 0 && arr[k]%3 == 0)
//				count++;
//		}
//		
//		return count;
        Map<Integer,Set<Character>> m=new HashMap<>();
        for(int i=0;i<rings.length();i=i+2){
            char c=rings.charAt(i);
            int index=(int)rings.charAt(i+1);
            if(m.containsKey(index)){
                Set<Character> x=m.get(index);
                x.add(c);
                m.put(index,x);
            }else{
                Set<Character> x=new HashSet<>();
                x.add(c);
                m.put(index,x);
            }
        }
        int count=0;
        for(Set<Character> k : m.values()){
            if(k.size()==3) count++;
        }
        return count;
	}

	public static void main(String[] args) {

		System.out.println(RingsAndRods.ringsAndRods("B0B6G0R6R0R6G9"));
		System.out.println(RingsAndRods.ringsAndRods("B0R0G0R9R0B0G0"));

	}

}
