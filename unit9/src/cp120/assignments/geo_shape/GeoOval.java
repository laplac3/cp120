package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Oval is a subclass of rectangle.
 * The GeoOval is a shape that is contained with in a GeoRectangle.
 * The GoRectangle that contains this class defines the major and minor access of the GeoOval.
 * There are methods for finding the area and the parameter of the oval.
 * There is also a method to draw the oval.
 * @author neil
 *
 */
public class GeoOval extends GeoRectangle {

	private double a = getWidth() /2;
	private double b = getHeight() /2;
	/**
	 * Constructor
	 * @param origin Origin of shape which is a instance variable from GeoPoint
	 * @param color Color of our oval
	 * @param width Width of the rectangle that contains the oval 
	 * @param height Height of the rectangle that contains the oval
	 */
	public GeoOval(GeoPoint origin, Color color, double width, double height) {
		super(origin, color, width, height);
	}

	/**
	 * Constructor
	 * @param width Width of the rectangle that contains the oval 
	 * @param height Height of the rectangle that contains the oval
	 */
	public GeoOval(double width, double height) {
		this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
	}

	/**
	 * Constructor
	 * @param origin Origin of shape which is a instance variable from GeoPoint
	 * @param width Width of the rectangle that contains the oval 
	 * @param height Height of the rectangle that contains the oval
	 */
	public GeoOval(GeoPoint origin, double width, double height) {
		this(origin, DEFAULT_COLOR, width, height);
	}

	/* 
	 * Draws a ellipse by passing it into the gtx.draw method.
	 */
	public void draw(Graphics2D gtx ) {
		System.out.println("Drawing oval: " + toString());
		float x = getOrigin().getXco();
		float y = getOrigin().getYco();
		double w = super.getWidth();
		double h = getHeight();		
		Ellipse2D oval = new Ellipse2D.Double( x, y, w, h );
		draw( oval, gtx );
		
	}
	
	/* 
	 * @returns Returns the parameter of the oval.
	 */
	public double perimeter() {

		return 2*Math.PI*Math.sqrt((a*a + b*b)/2);
	}
	
	/* 
	 * @return Returns the area of the oval
	 */
	public double area() {
		return a*b*Math.PI;
	}
}