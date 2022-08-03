package leetCodeIntermediate;

public class MaximumSumNotAdjacent {

	public static void main(String[] args) {
		
		int[] a = {5,5,10,100,10,5};
		
		int sum = 0;
		
//		for(int i=0; i<a.length;i++) {
//			int loopSum = 0;
//			int j=i;
//			while(j<a.length) {
//				loopSum += a[j];
//				
//				int temp = j+2;
//				if(temp < a.length) {
//					j = temp;
//				} else {
//					break;
//				}
//			}
//			sum = Math.max(loopSum, sum);		
//		}
		
        int inc = a[0], excl = 0;
        for(int i = 1; i < a.length; i++)
        {
            int ninc = excl + a[i];
            int nexcl = Math.max(inc , excl);
            
            inc = ninc;
            excl = nexcl;
        }
        
        System.out.println(Math.max(inc , excl));
    }

}
