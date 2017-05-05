package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

public class GeoLine extends GeoShape {
	
	private GeoPoint end;

	public GeoLine(GeoPoint origin, GeoPoint end) {
		this(origin, DEFAULT_COLOR, end);
	}
	
	public GeoLine(GeoPoint origin, Color color, GeoPoint end) {
		super(origin, color);
		this.end = end;
	}
	

	
	public void draw(Graphics2D gtx) {
		System.out.println("Drawing line: " + toString());
	}

	public GeoPoint getEnd() {
		return end;
	}

	public void setEnd(GeoPoint end) {
		this.end = end;
	}

	public GeoPoint getStart() {
		return getOrigin();
	}

	public void setStart(GeoPoint origin) {
		 setOrigin(origin);
	}
	
	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append(super.toString()).append(",end=").append(end);
		return strB.toString();
	}
	
	
}
