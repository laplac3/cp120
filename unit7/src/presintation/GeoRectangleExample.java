package presintation;

import java.awt.Color;


public class GeoRectangleExample extends GeoShapeExample {
	
	private double width;
	private double length;
	
	
	public GeoRectangleExample( GeoPointExample origin, double width, double length) {
		super(origin, Color.BLACK);
		this.width = width;
		this.length= length;
	}
	
	public GeoRectangleExample( double width, double length) {
		super(new GeoPointExample(0,0), Color.BLACK);
	}	

}
