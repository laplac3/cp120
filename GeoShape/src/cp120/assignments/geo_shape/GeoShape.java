package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public abstract class GeoShape {
	
	
	private GeoPoint origin = new GeoPoint();
	private Color color;
	
	public abstract void draw( Graphics2D gtx );

	public GeoPoint getOrigin() {
		return this.origin; 
	}


	public void setOrigin( GeoPoint origin ) {
		this.origin = origin;
	}
	
	public void setColor( Color color ) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public Point getIntOrigin() {
		return this.origin.getIntPoint();
	}

	public String toString() {
		
		StringBuilder strB = new StringBuilder();
		StringBuilder colorStr = new StringBuilder();
		
		colorStr = colorStr.append(Integer.toHexString(color.hashCode()));
		colorStr = colorStr.replace(0, 2, "#");
		
		strB = strB.append("origin=").append(origin).append(",color=").append(colorStr);
		return strB.toString();
	}

}
