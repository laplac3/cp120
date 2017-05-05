package cp120.assignments.geo_shape;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class GeoRectangle extends GeoShape {
	
	private double width;
	private double height;
	
	public void draw(Graphics2D gtx ) {
		StringBuilder strB = new StringBuilder();
		strB = strB.append("Drawing Rectangle: ").append(toString());
		System.out.println(strB);
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
		strB = strB.append(super.toString()).append(",width=").append(width).append(",height= ").append(height);	
		return strB.toString();
	}

}