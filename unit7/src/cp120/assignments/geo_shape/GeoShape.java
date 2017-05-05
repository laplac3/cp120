package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;


public abstract class GeoShape {
	
	
	private GeoPoint origin;
	private Color color;
	
	public static final GeoPoint DEFAULT_ORIGIN = new GeoPoint(0f,0f);
	public static final Color DEFAULT_COLOR = Color.BLUE;
	
	public GeoShape(GeoPoint origin, Color color) {
		this.origin = origin;
		this.color = color;
	}
	
	public GeoShape(GeoPoint origin) {
		this(origin,DEFAULT_COLOR);
	}
	
	public GeoShape(Color color) {
		this(DEFAULT_ORIGIN,color);
	}
	
	public GeoShape() {
		this( DEFAULT_ORIGIN, DEFAULT_COLOR);
	}
	
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
	
	public String getColorStr() {
		StringBuilder colorStr = new StringBuilder();
		colorStr = colorStr.append(Integer.toHexString(color.hashCode()));
		colorStr = colorStr.replace(0, 2, "#");
		return colorStr.toString();
	}
	
	public Point getIntOrigin() {
		return this.origin.getIntPoint();
	}


	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append("origin=").append(origin).append(",color=").append(getColorStr());
		return strB.toString();
	}


}
