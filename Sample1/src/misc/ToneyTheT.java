package misc;

import edu.uweo.javaintro.tools.Turtle;
//import java.util.*;

public class ToneyTheT {
	public static void main(String[] args) {
		
		//String[] Pallet = new String[]{"BLACK","BLUE"};
	
		Turtle Toney = new Turtle();
		
		Toney.switchTo( Turtle.BLUE );
		Toney.fillCircle(100);
		double xToney = 150;
		double rToney = 50;
		while ( rToney >= 0.5) {
		
			Toney.switchTo( Turtle.BLUE);
			Toney.move(0,xToney);
			Toney.fillCircle(rToney);
			
			xToney = xToney/2;
			rToney = rToney/2;
		}
		
		Turtle Toney1 = new Turtle();		
		double xToney1 = 150;
		double rToney1 = 50;
		Toney1.move(45,0);
		while ( rToney1 >= 0.5) {
		
			Toney1.switchTo( Turtle.BLUE);
			Toney1.move(0,xToney1);
			Toney1.fillCircle(rToney1);
			
			xToney1 = xToney1/2;
			rToney1 = rToney1/2;
		}

		
		Turtle Toney2 = new Turtle();		
		double xToney2 = 150;
		double rToney2 = 50;
		while ( rToney2 >= 0.5) {
		
			Toney2.switchTo( Turtle.BLUE);
			Toney2.move(0,xToney2);
			Toney2.fillCircle(rToney2);
		
			xToney2 = xToney2/2;
			rToney2 = rToney2/2;
		}
		
		
		Turtle James = new Turtle();
		 double xJames = 150;
		 double rJames = 50;
		 James.move(45,0);
		while ( rJames >=0.5) {
		
			James.switchTo( Turtle.BLUE);
			James.move(0,xJames);
			James.fillCircle(rJames);
			
			xJames = xJames/2;
			rJames = rJames/2;
		}

			Turtle Lisa = new Turtle();
			 double xLisa = 150;
			 double rLisa = 50;
			 Lisa.move(90,0);
			while ( rLisa >= 0.5) {
			
				Lisa.switchTo( Turtle.BLUE);
				Lisa.move(0,xLisa);
				Lisa.fillCircle(rLisa);
				
				xLisa = xLisa/2;
				rLisa = rLisa/2;			
			
			

		}
			
			Turtle May = new Turtle();
			 double xMay = 150;
			 double rMay = 50;
			 May.move(135,0);
			while ( rMay >= 0.5) {
			
				May.switchTo( Turtle.BLUE);
				May.move(0,xMay);
				May.fillCircle(rMay);
				
				xMay = xMay/2;
				rMay = rMay/2;			
			
			

		}
			
			Turtle a = new Turtle();
			 double xa = 150;
			 double ra = 50;
			 a.move(180,0);
			while ( ra >=0.5) {
			
				a.switchTo( Turtle.BLUE);
				a.move(0,xa);
				a.fillCircle(ra);
				
				xa = xa/2;
				ra = ra/2;			
			
		}

			Turtle a1 = new Turtle();
			 double xa1 = 150;
			 double ra1 = 50;
			 a1.move(225,0);
			while ( ra1 >=0.5) {
			
				a1.switchTo( Turtle.BLUE);
				a1.move(0,xa1);
				a1.fillCircle(ra1);
				
				xa1 = xa1/2;
				ra1 = ra1/2;			
			
		}
			Turtle a11 = new Turtle();
			 double xa11 = 150;
			 double ra11 = 50;
			 a11.move(270,0);
			while ( ra11 >= 0.5) {
			
				a11.switchTo( Turtle.BLUE);
				a11.move(0,xa11);
				a11.fillCircle(ra11);
				
				xa11 = xa11/2;
				ra11 = ra11/2;			
			
		}
			Turtle a3 = new Turtle();
			 double xa3 = 150;
			 double ra3 = 50;
			 a3.move(315,0);
			while ( ra3 >=0.5) {
			
				a3.switchTo( Turtle.BLUE);
				a3.move(0,xa3);
				a3.fillCircle(ra3);
				
				xa3 = xa3/2;
				ra3 = ra3/2;			
			
		}	
	
			/*Turtle axis = new Turtle();
			axis.switchTo( Turtle.BLACK );
			axis.paint(90.0,300.0);
			axis.move(180,300.0);
			axis.paint(90,400.0);
	
			axis.switchTo( Turtle.BLACK );
			axis.move(25, 50);
			axis.fillCircle(25);
			axis.move(0.0, -50);
			axis.move(-25, 0.0);
			axis.fillCircle(25);
			
			axis.switchTo( Turtle.GREEN);
			axis.move(25, 50);
			axis.fillCircle(10);
			axis.move(0.0, -50);
			axis.move(-25, 0.0);
			axis.fillCircle(10);*/
	}
}
