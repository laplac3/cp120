package presintation;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class GeoShape {
	
	private double origionX;
	private double origionY;
	private Color color;

	
	public void setOrigonX(double origionX ) {
		this.origionX = origionX;
	}
	
	public double getOrigonX() {
		return this.origionX;
	}
	
	

	public void setOrigonY(double origionX, double origionY ) {
		this.origionY = origionY;
	}
	
	public double getOrigonY() {
		return this.origionY;
	}
	
	public void setColor( Color color ) {
		this.color =color;
	}
	
	public Color getColor() {
		return this.color;
	}
	

	
	public void draw(Graphics2D dd ) {
		
	}

}
