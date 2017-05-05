// I named this hex but I really meant octagon 

package misc;
import edu.uweo.javaintro.tools.Turtle;

public class Octagon {
	public static void main(String[] args) {
		Turtle pete = new Turtle();
		pete.switchTo(Turtle.GREEN);
		pete.paint(0,32);
		for (int i=1;i<=7;i++){
			pete.paint(45,64);	
		}
		pete.paint(45,32);
	}

}
