package MergeIntervals;
import java.util.*;
public class MergeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List<Interval> mergeIntervals(Interval[] intervals) {
        LinkedList<Interval> merged = new LinkedList<>();
        
        for(Interval interval : intervals){
            if(merged.isEmpty() || merged.getLast().finish < interval.start){
                merged.add(interval);
            } else {
                merged.getLast().finish = Math.max(merged.getLast().finish, interval.finish); 
            }
        }
        
        return merged;
    }

}

class Interval {
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
