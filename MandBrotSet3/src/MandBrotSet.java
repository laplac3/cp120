// I used a polar coordinate system due to the imported Turtle class being in polar

import edu.uweo.javaintro.tools.Turtle;

public class MandBrotSet {


	public static void main(String[] args) {
		
		for ( double r=700;r>=0;r-=1) {  //radius

			for ( double t=0; t<=360 ;t+=.09) { //angle
				
				Turtle Laplac3 = new Turtle(); //my painter
				Laplac3.move(0, 150);
				
				double[] Z = {0,0}; //Z not
				
				double[] C = {xValue(r,t), yValue(r,t)}; // the point in question in x and y coordinates 
				
				double absNumb = abs(C); 
				
				int maxN = 1000; // max iteration 
				int n = 0; // 0'th iteration
				
				while (absNumb <= 2 && n<maxN) {  // check to see if a point is in the set
					n++;
					Z= plus(square(Z), C); // Zn+1
					absNumb = abs(Z);
				}
				
				if ( absNumb <= 2 && n == maxN ) {  // these are points in the set
					Laplac3.switchTo( Turtle.BLACK );
					Laplac3.move(t, r);
					Laplac3.fillCircle(1);
					//Laplac3.move(0.0, -r);
					//Laplac3.move(-t, 0.0);
					
				} else if (absNumb > 2 && n < maxN && n >= .08*maxN) { // points that diverge slowly
					Laplac3.switchTo( Turtle.MAGENTA );
					Laplac3.move(t, r);
					Laplac3.fillCircle(1);
					//System.out.println(absNumb);
					
				}else if (absNumb > 2 && n < maxN*.07  && n > .018*maxN) {
					Laplac3.switchTo( Turtle.GREEN );
					Laplac3.move(t, r);
					Laplac3.fillCircle(1);
					//System.out.println(absNumb);
					
				} else {
					Laplac3.switchTo( Turtle.BLACK ); // points that diverge instantly ie n=0 and the absolute value of our point is greater than 2.
					Laplac3.move(t, r);
					Laplac3.fillCircle(1);
					//System.out.println(absNumb);
				}
				
			}
			
		}

	}

	public static double yValue(double r, double t) { //y point
		return r*Math.sin(t*Math.PI/180)/300;
	}
	
	public static double xValue(double r, double t) { //x point
		return r*Math.cos(t*Math.PI/180)/350;
	}
	
	
	public static double[] square(double[] Z) { //the square of the Zn
		double[] Zp = {0,0};
		Zp[0] = Z[0]*Z[0]-Z[1]*Z[1]; //reals  a^2 +2 a b + b^2 where a = x and b = yi
		Zp[1] = 2*Z[0]*Z[1]; // imaginary 
		return Zp;
	}
	
	public static double[] plus(double[] Z, double[] C) {
		double[] Zp = {0,0};
		Zp[0] = Z[0]+C[0];  //real
		Zp[1] = Z[1]+C[1]; // imag
		return Zp;
	}
	
	public static double abs(double[] Z) {
		return Math.sqrt(Z[0]*Z[0]+Z[1]*Z[1]); // by the definition of the absolute value (distance from the origin) 
	}
}
