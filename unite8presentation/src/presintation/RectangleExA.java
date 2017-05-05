package presintation;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 * @author neil
 *
 */
/**
 * @author neil
 *
 */
public class RectangleExA {

	private Rectangle rect;
	
	/**
	 * @param xco
	 * @param yco
	 * @param width
	 * @param height
	 */
	public RectangleExA(double xco, double yco, double width, double height) {
		int iXco = (int)(xco + .5);
	    int iYco    = (int)(yco + .5);
	    int iWidth  = (int)(width + .5);
	    int iHeight = (int)(height + .5);
	    rect = new Rectangle( iXco, iYco, iWidth, iHeight );
	}

	public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	
    public void addWidth( double toAdd ) {
        double  newWidth    = rect.getWidth() + toAdd;
        int     iNewWidth   = (int)(newWidth + .5);
        rect.width = iNewWidth;
    }

    public void addheight( double toAdd ) {
        double  newHeight    = rect.getHeight() + toAdd;
        int     iNewHeight   = (int)(newHeight + .5);
        rect.width = iNewHeight;
    }

}
