package misc;

import edu.uweo.javaintro.tools.Turtle;

public class SquareCircle {

	public static void main(String[] args) {
		Turtle Nate = new Turtle();
		Turtle Mel = new Turtle();
		Nate.switchTo(Turtle.WHITE);
		Mel.switchTo(Turtle.BLACK);
		
		double len = 600.0; //length of square
		double r =len*.5*Math.sqrt(2);
		
		int iMax = 100; //max number of iterations
		
		for (int i=1; i<=iMax; i++) {
			if (i%2==0) {
				Nate.fillBox(len, len);
				r=len/2;
			} else {
				Mel.fillCircle(r);
				len=2*r/Math.sqrt(2);
			}
			
		}
	}

}
