package misc;

import java.util.*;
import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;
import edu.uweo.javaintro.tools.*;
import java.io.*;

public class BlackScreen {
	public static void main(String[] args) {
		

		Turtle Toney = new Turtle();
		Toney.switchTo( Turtlet.BLACK );
		//double pie = Math.PI;
				
		for ( double r=500;r>=0;r-=1) {

			for ( double t=0; t<=360 ;t+=1) {
			
				Toney.move(t, r);
				Toney.fillCircle(.5);
				Toney.move(0.0, -r);
				Toney.move(-t, 0.0);
			}
			
		}
	}
}

