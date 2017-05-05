package Bfrac;

import edu.uweo.javaintro.tools.Turtle;
import java.lang.Math;

public class BubbleFractal {


	public static void main(String[] args) {
		
		double radius = 2000; //radius of the center circle
		int its = 15; // true max iterations
		double moveI = 3000;  //use for zoom purpose
		double angleI = 45;  //use for zoom purpose
		double divisor = 4;
		//center bubble
		Turtle first = new Turtle();
		first.switchTo(Turtle.BLUE);
		first.move(angleI, -moveI);
		first.fillCircle(radius);
		//int j=2;
		
		while ( true ) { //do it many times to guaranty the fractal is complete
			
			Turtle Laplace = new Turtle();
			Laplace.switchTo(Turtle.BLUE);
			Laplace.move(angleI, -moveI);
			int nMax = (int) (its-Math.random()*its+1); // random max iterations 
			//System.out.println(nMax);
			double r=radius;
			double rpath = r + r/divisor;
			
			for (int n= 1; n<nMax; n++) {
				rpath=r+r/divisor;
				int theta = (int)(Math.random()*8 )*45;
				//System.out.println("ang= "+theta +", r= "+r+", n= "+n);
				Laplace.move(theta,rpath);
				r=r/divisor;
				
			}
			
			eightBubbles(Laplace, nMax, radius, divisor);
			//j++;
		}
		
	}
	
	
	public static void eightBubbles(Turtle Laplace, int n, double radius, double divisor) {
		
		for (int i=0; i<=8; i++) {
			 Laplace.move(45,(divisor+1)*radius/Math.pow(divisor, n));
			 Laplace.fillCircle(radius/Math.pow(divisor, n));
			 Laplace.move(0,-(divisor+1)*radius/Math.pow(divisor, n));
			 
		}
	}
}
