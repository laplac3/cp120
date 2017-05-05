package presintation;

import java.awt.Color;

public class ChainingDemo {
	private Color color;
	private double height;
	private double width;
	
	public ChainingDemo(Color color, double height, double width) {
		super();
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	public ChainingDemo( double height, double width) {
		this(Color.BLACK, height, width);
	}
	public ChainingDemo( double side ) {
		this(Color.BLACK,side,side);
	}
}
