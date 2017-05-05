package presintation;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import edu.uweo.javaintro.tools.Turtle;
import edu.uweo.javaintro.tools.Turtlet;
import javax.swing.JOptionPane;

public class ReluctantTurtle extends Turtle {

	private boolean alwaysCheck;
	private Color saveColor;
	private String name;
	private String strColor;
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getName() {
	return this.name;	
	}
	
	public void setAlwaysCheck( boolean alwaysCheck ) {
		 this.alwaysCheck = alwaysCheck;
	}
	
	
	public boolean getAlwaysCheck() {
		return this.alwaysCheck;
	}
	
	public Color getSaveColor() {	
		return this.saveColor;
	}
	
	public void setSaveColor( Color saveColor ) {
		 this.saveColor = switchTo( saveColor );
	}
	
	public void setStringColor( String strColor ) {
		this.strColor = strColor;
	}
	
	public String getStringColor() {
		return this.strColor;
	}
	
	
	public static void main(String[] args) {
		ReluctantTurtle harry = new ReluctantTurtle();
		Color harryColor = BLUE;
		String harryStrColor = "Blue";
		
		harry.setAlwaysCheck( false );
		harry.setSaveColor(harryColor);
		harry.setName( "harry" );
		harry.setStringColor(harryStrColor);
		harry.fillCircle(100, RED);
		String aboutHarry = harry.toString();
		System.out.println(aboutHarry);
		
		//harry.paint(23, 324);
		
		
//		BoxSpec boxspec = new BoxSpec();
//		boxspec.setBoxColor( PINK );
//		boxspec.setBoxHeight(100);
//		boxspec.setBoxWidth(100);
//		
//		harry.fillBox(boxspec);
//		harry.paint(23, 324);
//		
		
	}
	
	public Turtlet paint(double doesnt, double matter ) {
		say( "I don't really feel like it right this instant");
		//return this; 
		Turtlet turtle = super.paint(doesnt, matter);
		say("fine!");
		return turtle;
	}
	
	public void fillCircle( double radius, Color color) {
		
		if ( getAlwaysCheck() ) {
			String msg = "Do you really want to overide the fillCircle Message";
			int result = JOptionPane.showConfirmDialog(null, msg);
			
			if ( result == JOptionPane.YES_OPTION ) {
				Color   saveColor   = switchTo( color );
		        super.fillCircle( radius );
		        switchTo( saveColor );
				} else if ( result == JOptionPane.NO_OPTION ){
					super.fillCircle(radius);
			} else {
				
			}
		} 
		
	}
	
	
	public void fillBox( BoxSpec spec ) {
		Color saveColor = switchTo( spec.getBoxColor());
		super.fillBox(spec.getBoxWidth(), spec.getBoxHeigth());
		switchTo(saveColor);
	}
	
	
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str = str.append("alwaysCheck= ").append(getAlwaysCheck()).append(", ")
				.append(getName()).append("'s color is ").append(getStringColor());
		//System.out.println(str);
		return str.toString();
	}
	
}
