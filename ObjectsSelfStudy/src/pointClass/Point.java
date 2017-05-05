package pointClass;

public class Point {
	private int x;
	private int y;

	//Constructor for new objects
	
	public Point(int x, int y ) {
		setLocation(x,y);
	}
	
	public Point() {
		this(0,0);
	}
	
	public void setLocation(int x, int y) {
		this.x =x;
		this.y =y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	//set: mutator method because it changes the state of the object it is called on
	public void translate(int dx, int dy) {
		setLocation(this.x + dx,this.y + dy);
	}
	
	//get/is: accessor method uses objects state to return info 
	public double distanceO() {
		return Math.sqrt(x*x+y*y);
	}
	
	public String toString() {
		return "(" + x + "," + y +")";
	}

}
