package presintation;

import java.awt.Color;

import edu.uweo.javaintro.tools.Turtle;

public class TintedTurtle extends Turtle {
	
	private boolean alwaysCheck;
	
	public void setAlwaysCheck(boolean alwayscheck){
		this.alwaysCheck =alwaysCheck;
	}
	
	public boolean getAlwaysCheck(){
		return this.alwaysCheck;
	}
	public TintedTurtle() {
		this( Color.BLACK,0,0);
	}
	
	public TintedTurtle( Color color) {
		this(color,0,0);
	}
	
	public TintedTurtle( double degrees, double pixels ) {
		this(Color.BLACK,degrees, pixels);
	}
	
	public TintedTurtle( Color color ,double degrees, double pixels ) {
		move(degrees, pixels);
		switchTo(color);
	}
	
	private void init() {
		//
	}
	
	public void fillCircle(double r) {
		if ( getAlwaysCheck() ) {
			super.fillCircle(r);
			
		} else {}
	}
}

