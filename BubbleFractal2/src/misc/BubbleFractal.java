//Neil Nevitt
//OOP java
//HW1

package misc;

import edu.uweo.javaintro.tools.Turtle;

public class BubbleFractal {


	public static void main(String[] args) {
	Turtle Laplac3 = new Turtle();
	Laplac3.switchTo(Turtle.GREEN);
	
	//first Bubble
	double radInt = 128;
	Laplac3.move(180, radInt*1.8 );
	Laplac3.move(180,0);
	Laplac3.fillCircle(radInt);
	Laplac3.move(0,radInt+radInt/2);
	radInt = radInt/2;
	Laplac3.fillCircle(radInt);
	
	int nMax = 8; //number of total iterations
	int j =1;
	
	while (j< nMax) {
		Laplac3.move(0,radInt/Math.pow(2, j-1)+radInt/Math.pow(2, j));
		Laplac3.fillCircle(radInt/Math.pow(2, j));
		j++;
	}
	
	Laplac3.move(180, 0);
	j--;
	
	while (j>= 1) {
		Laplac3.move(0,radInt/Math.pow(2, j-1)+radInt/Math.pow(2, j));
		Laplac3.fillCircle(radInt/Math.pow(2, j-1));
		j--;
		
	}
	Laplac3.move(180+45, 0);
	
	
	//fractal for fun
	Laplac3.switchTo(Turtle.BLUE);
	for(int k=1;k <= 1;k++) {

		straight(1,nMax,radInt,Laplac3);
		Laplac3.move(180, 0);
		//Laplac3.move(, 0);
		
		//Laplac3.move(45, 0);
		Laplac3.switchTo(Turtle.RED);
		//Laplac3.move(180, 0);
		Laplac3.move(0, radInt/Math.pow(2, 0));
		Laplac3.fillCircle(1);
		
	}
	
	
	
		

	
	}
	
	public static void straight(int n, int nMax, double radInt, Turtle leo) {
		double dev = 4; // deviser of radius
		int j = n;
		
		for(n=1;n<=nMax;n++) {
			
			for (int theta=0; theta<=360;theta +=45) {
				leo.move(theta, 0);  // turn
				while (j< nMax) {
					leo.move(0,radInt/Math.pow(dev, j-1)+radInt/Math.pow(dev, j));
					leo.fillCircle(radInt/Math.pow(dev, j));
					j++;
				}
				
				leo.move(180, 0);
				j--;
				
				while (j>= n) {
					leo.move(0,radInt/Math.pow(dev, j-1)+radInt/Math.pow(dev, j));
					leo.fillCircle(radInt/Math.pow(dev, j-1));
					j--;
					
				}
				j=n;//n
				leo.move(180, 0);
			}
			leo.move(180, 0);
			leo.move(0, radInt/Math.pow(dev, nMax)+radInt/Math.pow(dev, nMax+1));
			
		}

		
		
	}

		
		


}
