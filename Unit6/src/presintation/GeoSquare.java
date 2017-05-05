package presintation;

public class GeoSquare extends GeoRectangle {
	
	public void setSide( double side ) {
		setWidth(side);
		setHeigth(side);
	}
	
	public double getSide() {
		return getWidth();
	}

}
