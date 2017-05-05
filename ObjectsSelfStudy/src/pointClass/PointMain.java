package pointClass;

public class PointMain {
	
	public static void main(String[] args) {
		
		//Point 1
		Point p1 = new Point();
		//without constructor
		//p1.x =1;
		//p1.y =1;
		
		Point p2 = new Point(9,-5);
		//without constructor
		//p2.x = 9;
		//p2.y =-5;
		
		System.out.println("p1=" + p1.toString() + "p2=" + p2.toString());
		p1.translate(1, 2);
		System.out.println("p1=" + p1.toString());
		double dis2 = p2.distanceO();
		System.out.println("dis2=" + dis2);
	}
}
