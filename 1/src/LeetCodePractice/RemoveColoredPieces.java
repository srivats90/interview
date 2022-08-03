package LeetCodePractice;

public class RemoveColoredPieces {

	public static void main(String[] args) {
		
		String color = "AA";
		
		int[] count = colorsCount(color);
		
		if(count[0] > count[1])
			System.out.println(true);
		else {
			System.out.println(false);
		}

	}

	private static int[] colorsCount(String color) {
		
		int aCount = 0;
		int bCount = 0;
		for(int i = 2; i < color.length(); i++) {
			
			if(color.charAt(i) == 'A' && color.charAt(i-1) == 'A' && color.charAt(i-2) == 'A') {
				aCount++;
			} else if (color.charAt(i) == 'B' && color.charAt(i-1) == 'B' && color.charAt(i-2) == 'B') {
				bCount++;
			}
		}
		
		return new int[] {aCount, bCount};
	}

}
