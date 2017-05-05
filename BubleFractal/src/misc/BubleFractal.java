package misc;

import edu.uweo.javaintro.tools.*;

public class BubleFractal {
	
	public static void main(String[] args) {
		
		int nMax = 2; //Number of iterations how many branches
		int iMax =8; // Number of branches from node
		
		double rCenter=150.0; // radius
		

		Turtle Laplac3 = new Turtle();
		Laplac3.switchTo(Turtlet.BLUE);
		Laplac3.fillCircle(rCenter);
		double rPath=rCenter;
		double rad=0;
		end8Bubbels(0,rCenter/4, Laplac3);
		
		for (int n=1;n<=nMax;n+=1) {
			rPath= rCenter+rCenter/Math.pow(4, n);
			rad=rCenter/Math.pow(4, n+1);
			Laplac3.move(0, rPath);
			end8Bubbels(n,rad, Laplac3);			
			Laplac3.move(0, -rPath);
		}
	}	
	
	

	
	
	public static void end8Bubbels(int n, double r, Turtle Laplac3) { //nMax should be the number of iterations
		double rPath = r/Math.pow(4,n)+r;
		for (int i=0;i<8;i+=1) {

			Laplac3.move(45*i,rPath);
			Laplac3.fillCircle(r);				
			Laplac3.move(0,-rPath);
			Laplac3.move(-45*i,0);
			
		}
	}
	
}	

