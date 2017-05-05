package objectArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import edu.uweo.javaintro.tools.Turtle;
public class ObjectList {


	public static void main(String[] args) {
		List<Object> obj = new ArrayList<Object>();
		List<Integer> ints = new ArrayList<Integer>();
		List<String> str = new ArrayList<String>();
		List<Turtle> turtles = new ArrayList<Turtle>();
		
		ints.add(1);
		ints.add(2);
		
		
		str.add("hello");
		str.add("world");
		
		Turtle Laplace = new Turtle();
		turtles.add(Laplace);
		
		obj.add("1");
		obj.add(1);
		obj.add("help");
		obj.add(ints);
		obj.add(str);
		obj.add(turtles);
		
		
		for(Object a : obj) {
			
			try {
				String word = (String)a;
				int num = Integer.parseInt(word);
				System.out.println(num);
				
				
			} catch ( /*IOException  | ClassNotFoundException  | IllegalArgumentException |  */NumberFormatException n  ) {
				
		}
		
		//for(int a : ints) {
		//	System.out.println(a);
		}
	}
	
}
