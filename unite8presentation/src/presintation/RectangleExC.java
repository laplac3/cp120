package presintation;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class RectangleExC {
	private Rectangle2D rect;
	
	public RectangleExC(double xco, double yco, double width, double height) {
		rect = new Rectangle.Double(xco, yco, width, height);
	}
	
	public void addWidth(double toAdd) {
		double  newWidth    = rect.getWidth() + toAdd;
        rect.setRect( rect.getX(), rect.getHeight(),
                      newWidth, rect.getHeight() );
	}
	
}
