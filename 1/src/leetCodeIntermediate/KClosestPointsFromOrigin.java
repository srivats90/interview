package leetCodeIntermediate;

import java.util.*;

public class KClosestPointsFromOrigin {

	public static void main(String[] args) {
		
		kClosestPoints(new Point[] {new Point(1, 3), new Point(3, 4), new Point(2, -1)}, 2);

	}

	private static void kClosestPoints(Point[] points, int k) {
		
		PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1, p2) -> p2.distanceFromOrigin() - p1.distanceFromOrigin());
		
		for(int i= 0; i <k ;i++) {
			maxHeap.add(points[i]);
		}
		
		for(int j=k ; j<points.length; j++) {
			if(points[j].distanceFromOrigin() < maxHeap.peek().distanceFromOrigin()) {
				maxHeap.poll();
				maxHeap.add(points[j]);
			}
		}
		
		for(Point p : maxHeap) {
			System.out.println(p.toString());
		}
	
	}

}

class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int distanceFromOrigin() {
		return x*x + y*y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
