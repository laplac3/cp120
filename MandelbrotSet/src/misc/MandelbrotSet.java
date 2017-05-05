package misc;

import java.util.concurrent.TimeUnit;
import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;
import edu.uweo.javaintro.tools.*;
import edu.uweo.javaintro.tools.*;
import edu.uweo.javaintro.tools.*;

public class MandelbrotSet {
	public static void main(String[] args) throws InterruptedException {
		
		Turtle Toney = new Turtle();
		

		double r = 0.0;
		double theta = 0;
		int iteration =0;
		int maxIteration=1000;
		double xtemp = 0.0;
		
		for (double x=1; x<=300.0;x+=1) {
			for (double y=-200.0; y<=200.0;y+=1) {
				iteration =0;
				theta = Math.atan( y / x );
				r = y / Math.sin(theta);
				System.out.println("x= "+x+" y="+y+" r="+r+" theta="+theta);
				//TimeUnit.SECONDS.sleep(1);
				//x and y prime to check to see if point lies in the set or not
				double xp=x;
				double yp=y;
				
				while (xp*xp+yp*yp<2*2 && iteration < maxIteration) {
					xtemp = xp*xp-yp*yp-x;
					yp = 2*xp*yp +y;
					xp=xtemp;
					iteration+=1;
					double z =xp*xp+yp*yp;
					System.out.println("it="+iteration + " " + "z="+ z);
				}
				
				if (iteration == maxIteration && xp*xp+yp*yp<2) {  //countably divergent
					Toney.switchTo( Turtlet.BLACK );
					Toney.move( theta * 180/Math.PI, r);
					Toney.fillCircle(10);
					Toney.move(0.0, -r);
					Toney.move(-theta * 180/Math.PI, 0.0);
				} else if (xp*xp+yp*yp<2*2) {  //convergent
					Toney.switchTo( Turtlet.BLACK );
					Toney.move(theta * 180/Math.PI, r);
					Toney.fillCircle(10);
					Toney.move(0.0, -r);
					Toney.move(-theta * 180/Math.PI, 0.0);
				} else {  //divergent
					Toney.switchTo( Turtlet.BLUE );
					Toney.move(theta * 180/Math.PI, r);
					Toney.fillCircle(10);
					Toney.move(0.0, -r);
					Toney.move(-theta * 180/Math.PI, 0.0);
				}
				
			}
		}
	}

}
