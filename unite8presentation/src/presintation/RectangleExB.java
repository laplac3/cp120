package presintation;

import java.awt.Rectangle;

public class RectangleExB {
    private Rectangle   rect;
    private double      xco;
    private double      yco;
    private double      width;
    private double      height;

    public RectangleExB( double xco, double yco, double width, double height) {
		super();
		this.xco = xco;
		this.yco = yco;
		this.width = width;
		this.height = height;
		
        int iXco    = (int)(xco + .5);
        int iYco    = (int)(yco + .5);
        int iWidth  = (int)(width + .5);
        int iHeight = (int)(height + .5);
        rect = new Rectangle( iXco, iYco, iWidth, iHeight );
	}

    public void addWidth(double toAdd) {
    	width = width + toAdd;
        int     iNewWidth   = (int)(width + .5);
        rect.width = iNewWidth;
    }
    //getters and setters
	public Rectangle getRect() {
		return rect;
	}

	public void setRect(Rectangle rect) {
		this.rect = rect;
	}

	public double getXco() {
		return xco;
	}

	public void setXco(double xco) {
		this.xco = xco;
	}

	public double getYco() {
		return yco;
	}

	public void setYco(double yco) {
		this.yco = yco;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
