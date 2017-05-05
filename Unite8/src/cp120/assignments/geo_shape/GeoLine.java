package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 * This is a class that defines the object GeoLine.
 * GeoLine is a Subclass of GeoShape
 * Every line has a Starting point which is origin which is a instance variable from the GeoPoint class.
 * Every line has an ending point which is a GeoPoint and private instance variable of this class.
 * There are Methods for finding both length and slope.
 * We can also use a Graphics2D method draw to draw our line.
 * 
 * @author neil
 *
 */
public class GeoLine extends GeoShape {
	
	private GeoPoint end;

	/**
	 * Constructor 
	 * 
	 * @param origin The starting point 
	 * @param color The color 
	 * @param end The Ending point 
	 */
	public GeoLine(GeoPoint origin, Color color, GeoPoint end) {
		super(origin, color);
		this.end = end;
	}
	
	/**
	 * Constructor 
	 * 
	 * @param origin The starting point 
	 * @param end The Ending point 
	 */
	public GeoLine(GeoPoint origin, GeoPoint end) {
		super(origin, DEFAULT_COLOR);
		this.end = end;
	}
	
	/* 
	 * Draws the line by creating a Line2D object and pasing it into the gtx.draw method.
	 */
	public void draw(Graphics2D gtx) {
		System.out.println("Drawing line: " + toString());
		float xO = getOrigin().getXco();
		float yO = getOrigin().getYco();
		float xE = end.getXco();
		float yE = end.getYco();
		Line2D line = new Line2D.Double(xO,yO,xE, yE);
		gtx.setColor(getColor());
		gtx.draw(line);
	}

	/**
	 * Getter for the end.
	 * @return Returns the end point
	 */
	public GeoPoint getEnd() {
		return end;
	}

	/**
	 * Setter for ending point
	 * @param Sets the ending point to end. 
	 */
	public void setEnd(GeoPoint end) {
		this.end = end;
	}

	/**
	 * Getter for starting point.
	 * @return The origin from GoePoint.
	 */
	public GeoPoint getStart() {
		return getOrigin();
	}

	/**
	 * Setter for the starting point.
	 * @param origin is the instance field from GeoPoint.
	 */
	public void setStart(GeoPoint origin) {
		 setOrigin(origin);
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append(super.toString()).append(",end=").append(end);
		return strB.toString();
	}
	
	/**
	 * 
	 * @return The length of the line using the distance method from GeoPoint
	 */
	public double length() {
		return getOrigin().distance(end);
	}
	
	/**
	 * 
	 * @return the slope for GeoLine
	 */
	public double slope() {
		double delX = end.getXco()-getStart().getXco();
		double delY = end.getYco()-getStart().getYco();
		double slope = delY / delX;
		return slope;
	}
	
}
