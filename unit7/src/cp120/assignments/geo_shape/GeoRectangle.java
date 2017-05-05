package cp120.assignments.geo_shape;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class GeoRectangle extends GeoShape {
	
	private double width;
	private double height;

	public GeoRectangle(GeoPoint origin, Color color, double width, double height) {
		super(origin, color);
		this.width = width;
		this.height = height;
	}
	
	public GeoRectangle( double width, double height) {
		this( DEFAULT_ORIGIN, DEFAULT_COLOR,width,height) ;
	}	
	
	public GeoRectangle(GeoPoint origin, double width, double height) {
		this(origin, DEFAULT_COLOR, width, height);
	}
	
	public void draw(Graphics2D gtx ) {
		System.out.println("Drawing rectangle: " + toString());
	}
	
	public void setWidth( double width ) {
		this.width = width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight( double height ) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append(super.toString()).append(",width=").append(width).append(",height=").append(height);
		return strB.toString();
	}
	
	public double area() {
		return width*height;
	}
	
	public double perimeter() {
		return 2*width +2*height;
	}

}