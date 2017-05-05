package presintation;

import edu.uweo.javaintro.tools.Turtle;

public class SuperTurtle extends Turtle {


	public static void main(String[] args) {
		//drawHexagon(100);
		//drawOctagon(100);
		//drawPolygon(13, 40);
		
		for ( int i = 3; i<50; i++)
			drawPolygon(100-i*1.55, i);
	
	}

	private static void drawPolygon(double side, int numSides) {
		double theta = 360 / numSides;
		SuperTurtle laplace = new SuperTurtle();
		laplace.move(270, 270-(50-numSides));
		laplace.move(90,0);
		for ( int i =0; i <= numSides; i++ )
			laplace.paint( theta, side);
		
	}

	private static void drawOctagon(double side ) {
		drawPolygon(side,8);
		
	}

	private static void drawHexagon(double side) {
		drawPolygon(side,6);
		
	}

}
