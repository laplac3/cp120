import java.awt.Color;


public class compairChar {

	private Color color;
	//private static TestChar nullColor = new TestChar();
	
	public static void main(String[] args) {
		//boolean result = Character.isLetter('a');
		//System.out.print(result);
		
		compairChar larry = new compairChar(Color.red);
		compairChar jim = new compairChar();
		//System.out.println(nullColor);
		//System.out.println();
		//boolean larryColor = larry.getColor().equals(nullColor.getColor());
		//boolean jimColor = jim.getColor().equals(nullColor.getColor());
		
		if ( larry.getColor() == null) 
			System.out.println("larry's color was nul");
		else
			System.out.println("larry's color was not nul");
		
		if ( jim.getColor() == null)
			System.out.println("jim's color was nul");
		else
			System.out.println("jim's color was nul");
		
	}
	


	public compairChar(Color color) {
		super();
		this.color = color;
	}

	public compairChar() {
		this.color = null;
	}
	
	public Color getColor() {
		return this.color;
	}

}
