package pointExample;

import java.awt.Point;

public class PointExample {
	
	public static void main(String[] args) {
		
		Point point = new Point(2,3);
		System.out.println(point);
		point.translate(1, 1);
		System.out.println(point);
	}
}
