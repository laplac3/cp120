package presintation;

import java.awt.Color;
import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;

public class BoxSpec {
	private double width;
	private double height; 
	private Color bcolor;
	
	public void setBoxWidth(double width) {
		this.width = width;
	}
	
	public double getBoxWidth() {
		return this.width;
	}
	
	public void setBoxHeight(double height) {
		this.height = height;
	}
	
	public double getBoxHeigth() {
		return this.height;
	}
	
	public void setBoxColor( Color bcolor) {
		this.bcolor = bcolor;
	}

	public Color getBoxColor() {
		return this.bcolor;
	}
	
}
