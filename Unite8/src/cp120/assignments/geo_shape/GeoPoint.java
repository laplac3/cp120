package cp120.assignments.geo_shape;

import java.awt.Point;

public class GeoPoint {
	
	private float xco;
	private float yco;
	
	/**
	 * Constructor for GeoPoint 
	 * @param xco x coordinated
	 * @param yco y coordinated
	 */
	public GeoPoint(float xco, float yco) {
		this.xco = xco;
		this.yco = yco;
	}
	
	/**
	 * Getter for the x coordinate of GeoPoint
	 * @param xco x coordinate
	 */
	public float getXco() {
		return xco;
	}
	/**
	 * Setter for the x coordinate of GeoPoint
	 * @param xco x coordinate
	 */
	public void setXco(float xco) {
		this.xco = xco;
	}
	/**
	 * Getter for the y coordinate of GeoPoint
	 * @param yco y coordinate
	 */
	public float getYco() {
		return yco;
	}
	/**
	 * Setter for the y coordinate of GeoPoint
	 * @param yco y coordinate
	 */
	public void setYco(float yco) {
		this.yco = yco;
	}
	
	/**
	 * 
	 * @return returns a GeoPoint as a Point where x and y have been rounded to integers.
	 */
	public Point getIntPoint() {
		int xco = Math.round(this.xco);
		int yco = Math.round(this.yco);
		Point pair = new Point(xco,yco);
		return pair;
	}
	
	/**
	 * This is a method that measures the distance between two GeoPoints.
	 * @param other is the one of the end points of the line segment we are measuring.
	 * @return distance is being returned between the points two points.
	 */
	public float distance(GeoPoint other) {
		float xdis = other.xco-this.xco;
		float xSquare = xdis*xdis;
		float ydis = other.yco-this.yco;
		float ySquare = ydis*ydis;
		float disSquare = ySquare + xSquare;
		float dis = (float) Math.sqrt(disSquare);
		return dis;
	}

	public String toString() {
		StringBuilder xY = new StringBuilder();
		xY = xY.append("(").append(xco).append(",").append(yco).append(")");
		return xY.toString();
	}
}

