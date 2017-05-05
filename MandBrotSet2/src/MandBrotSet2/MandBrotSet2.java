package MandBrotSet2;
import java.lang.Math;

import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;

public class MandBrotSet2 {
	
	
	public static void main(String[] args) {
		

		Turtle Toney = new Turtle();
		int nMax = 25; // max iterations 

		
		
		for ( double r=0;r<=500;++r) {

			for ( double t=0; t<=360; ++t ) {

				double x =r*Math.cos(t*Math.PI/180);
				double y =r*Math.sin(t*Math.PI/180);
				
				Complex Z = new Complex(0,0);
				Complex C = new Complex(x ,y);
				Complex Zsq = new Complex(0,0);
				Z = Zsq.plus(C);
				double abs =Z.abs();

				
				for ( int n=0; n <= nMax;++n) {
					Zsq=Z.sq();
					Z=Zsq.plus(C);
					abs=Z.abs();			
					//System.out.println("Z.abs()= "+abs+" n= "+ n + " re= "+ Z.re+ " im= "+Z.im);
					
					if (n == nMax && abs<=2 ) {  //convergent
						Toney.switchTo( Turtlet.BLACK );
						Toney.move(t, r);
						Toney.fillCircle(1);
						Toney.move(0.0, -r);
						Toney.move(-t, 0.0);
						//System.out.println("Z.abs()= "+a+" n= "+ n + " re= "+ Z.re+ " im= "+Z.im);
						break;
						
					} else if ( abs>0 && n<nMax && n>0 ) {  //divergent slowly 
						Toney.switchTo( Turtlet.GREEN );
						Toney.move(t, r);
						Toney.fillCircle(1);
						Toney.move(0.0, -r);
						Toney.move(-t, 0.0);
						//System.out.println("Z.abs()= "+a+" n= "+ n + " x= "+ x+ " y= "+y);
						break;
						
						
					} else if ( abs>0 && n==0 ) {  //divergent
						Toney.switchTo( Turtlet.BLUE );
						Toney.move(t, r);
						Toney.fillCircle(1);
						Toney.move(0.0, -r);
						Toney.move(-t, 0.0);						
						System.out.println("Z.abs()= "+abs+" n= "+ n + " re= "+ Z.re+ " im= "+Z.im);
						break;

					} else {
						//System.out.println("Z.abs()= "+abs+" n= "+ n + " re= "+ Z.re+ " im= "+Z.im);
						}	
					
				} 
				
					
				//System.out.println("x= " + x + "y= "+ y);
				//System.out.println("Z.abs()= "+a+" n= "+ n + " re= "+ Z.re+ " im= "+Z.im);

				
			}
		}
	}
}

