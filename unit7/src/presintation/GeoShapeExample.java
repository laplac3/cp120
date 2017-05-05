package presintation;

import java.awt.Color;

public abstract class GeoShapeExample {
		
	private GeoPointExample origin;
	private Color color;
		
	public GeoShapeExample( GeoPointExample origin, Color color ) {
		this.origin = origin;
		this.color = color;
	}

}
