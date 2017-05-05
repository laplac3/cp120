package presintation;

import edu.uweo.javaintro.tools.Turtle;

public class NameTurtle extends Turtle {

	public static void main(String[] args) {
		
		NameTurtle laplace = new NameTurtle();
		laplace.switchTo(GREEN);
		laplace.fillCircle(100);

		NameTurtle larry = new NameTurtle();
		String larryStr = "Ran out of Ideas";
		test(larry,larryStr);
	}
	
	public static void test(Object larry, Object larryStr) {
		System.out.println(larry instanceof NameTurtle);
		System.out.println(larry instanceof Turtle);
		System.out.println(larry instanceof Object);
		System.out.println(larryStr instanceof String);
		System.out.println(larryStr instanceof Object );
		
		System.out.println(larryStr instanceof Turtle);
	}

}
