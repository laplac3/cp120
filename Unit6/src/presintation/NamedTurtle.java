package presintation;

import java.awt.Color;

import edu.uweo.javaintro.tools.Turtle;

public class NamedTurtle extends Turtle {
	
	
	//public String temp;
	//public String name;
	
	
/*
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String turtleName ) {
		name = turtleName;
	}
*/
	
/*	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String turtleName ) {
		this.name = turtleName;
	}
	*/
	
	

private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	
	private String nickName;
	
	public String getNickName() {
		return this.nickName;
	}
	
	public void setNickName(String nickName ) {
		this.nickName = nickName;
	}
	
	public static void main(String[] args) {
		

		NamedTurtle abe = new NamedTurtle();
		NamedTurtle juan = new NamedTurtle();
		
	/*
		abe.drawSquare(128,BLUE);
		juan.move(0,133);
		juan.drawSquare(128,GREEN);
	*/
		
		
		
		abe.name = "Tom";
		juan.name = "Jerry";
		System.out.println(abe.name +" and " + juan.name);
	
		
	
	/*
		abe.setName("Tom");
		juan.setName("Jerry");
		System.out.println( abe.getName() + " and " + juan.getName() );
	*/
		
		abe.setNickName("Tommy");
		juan.setNickName("James");
		System.out.println(abe.getNickName() + " and " + juan.getNickName());
		
		
	}

	public void drawSquare(double side, Color color) {
		switchTo(color);
		for (int i=0; i<4; i++)
			paint(90, side);
		
	}

	
	
	

}
