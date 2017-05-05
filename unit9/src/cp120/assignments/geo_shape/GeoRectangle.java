package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


/**
 * This is the class that defines the shape GeoRectangle.
 * GeoRectangle is a subclass of GeoShape.
 * The top left corner is the origin of the Rectangle. The bottom left of the corner is the ending point. To get to the end point we simply move right and then down by the width and the height of the rectangle.
 * GeoRectangle has methods for finding the area, perimeter and to draw the rectangle.
 * 
 * @author neil
 *
 */
public class GeoRectangle extends GeoShape {
	
	private double width;
	private double height;

	/**
	 * Constructor for GeoRectangle.
	 * Constructor for GeoRectangle that customizes all attributes of the rectangle.
	 * @param origin The instance variable for GeoPoint. This is the top left corner of the rectangle.
	 * @param color The instance variable for GeoPoint. This is the color of the interior of the rectangle.
	 * @param width This is the GeoRectangle instance field width.
	 * @param height This is the GeoRectangle instance field height.
	 */
	public GeoRectangle(GeoPoint origin, Color color, double width, double height) {
		super(origin, color);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Constructor for GeoRectangle.
	 * Constructor for GeoRectangle that sets the origin and color to default origin and colors in GeoShape class.
	 * @param width This is the GeoRectangle instance field width.
	 * @param height This is the GeoRectangle instance field height.
	 */
	public GeoRectangle( double width, double height) {
		this( DEFAULT_ORIGIN, DEFAULT_COLOR,width,height) ;
	}	
	
	/**
	 * Constructor for GeoRectangle.
	 * Constructor for GeoRectangle that sets color to default color.
	 * @param origin This is the GeoPoint instance field.
	 * @param width This is the GeoRectangle instance field width 
	 * @param height This is the GeoRectangle instance field height 
	 */
	public GeoRectangle(GeoPoint origin, double width, double height) {
		this(origin, DEFAULT_COLOR, width, height);
	}
	

	public void draw(Graphics2D gtx ) {
		System.out.println("Drawing rectangle: " + toString());
		float x = getOrigin().getXco();
		float y = getOrigin().getYco();
		Rectangle2D rect = new Rectangle2D.Double( x, y, width, height );
		draw( rect , gtx );
	}
	
	/**
	 * Setter for the width of the rectangle
	 * @param width Width of the rectangle
	 */
	public void setWidth( double width ) {
		this.width = width;
	}
	
	/**
	 * Getter for the width
	 * @return Returns the width of the rectangle.
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * Setter for the Height
	 * @param height the height instance variable
	 */
	public void setHeight( double height ) {
		this.height = height;
	}
	
	/**
	 * Getter for the height instance variable.
	 * @return Returns the height of the rectangle
	 */
	public double getHeight() {
		return this.height;
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append(super.toString()).append(",width=").append(width).append(",height=").append(height);
		return strB.toString();
	}
	
	/**
	 * Calculates the area of the rectangle
	 * @return Returns the area of the rectangle
	 */
	public double area() {
		return this.width*this.height;
	}
	
	/**
	 * @return Returns the distance around the squares border 
	 */
	public double perimeter() {
		return 2*width +2*height;
	}

}