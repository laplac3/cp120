package cp120.assignments.geo_shape;

import java.awt.Graphics2D;

public class GeoOval extends GeoRectangle {
	
	public void draw(Graphics2D gtx ) {
		StringBuilder strB = new StringBuilder();
		strB = strB.append("Drawing Oval: ").append(toString());
		System.out.println(strB);
	}
	
}
