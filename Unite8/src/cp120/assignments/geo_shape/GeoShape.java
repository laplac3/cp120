package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;


public abstract class GeoShape {
		
	/**
	 * Default origin equal to the origin.
	 */
	public static final GeoPoint DEFAULT_ORIGIN = new GeoPoint(0f,0f);
	
	/**
	 *Default color set to blue. 
	 */
	public static final Color DEFAULT_COLOR = Color.BLUE;
	/**
	 *Default edge color set to blue. 
	 */
	public static final Color DEFAULT_EDGE_COLOR = Color.BLUE;

	/**
	 * Default edge width set to one pixel wide
	 */
	public static final float DEFAULT_EDGE_WIDTH = 1;
	
	private GeoPoint origin;
	private Color color;
	private float edgeWidth = DEFAULT_EDGE_WIDTH;
	private Color edgeColor = DEFAULT_EDGE_COLOR;
	
	
	/**
	 * A getter for edge width.
	 * @return Returns the width of the edge.
	 */
	public float getEdgeWidth() {
		return edgeWidth;
	}

	/**
	 * Setter for the edge width.
	 * @param edgeWidth edge of shape
	 */
	public void setEdgeWidth(float edgeWidth) {
		this.edgeWidth = edgeWidth;
	}

	/**
	 * Getter for edge color.
	 * @return Returns edge Color
	 */
	public Color getEdgeColor() {
		return edgeColor;
	}

	/**
	 * Setter for the edge color.
	 * @param edgeColor sets the edge color.
	 */
	public void setEdgeColor(Color edgeColor) {
		this.edgeColor = edgeColor;
	}

	/**
	 * Setter for the edge.
	 * @param edgeColor sets the edge color.
	 * @param edgeWidth sets the edge width.
	 */
	public void setEdge(Color edgeColor, float edgeWidth ) {
		this.edgeWidth = edgeWidth;
		this.edgeColor = edgeColor;
	}
	
	/**
	 * Constructor for GeoShape
	 * @param origin sets the origin.
	 * @param color sets the color.
	 */
	public GeoShape(GeoPoint origin, Color color) {
		this.origin = origin;
		this.color = color;
	}
	
	/**
	 * Constructor for GeoShape
	 * @param origin Sets the origin.
	 */
	public GeoShape(GeoPoint origin) {
		this(origin,DEFAULT_COLOR);
	}
	
	/**
	 * Constructor for GeoShape.
	 * @param color sets the color.
	 */
	public GeoShape(Color color) {
		this(DEFAULT_ORIGIN,color);
	}
	
	/**
	 * Constructor for GeoShape
	 * Default constructor.  Sets color and origin to Default.
	 */
	public GeoShape() {
		this( DEFAULT_ORIGIN, DEFAULT_COLOR);
	}
	
	/**
	 * Abstract method
	 * All shapes have the draw method so that the shape can be drawn.
	 * @param gtx 
	 */
	public abstract void draw( Graphics2D gtx );

	/**
	 * Getter for the origin.
	 * @return returns GeoPoint origin.
	 */
	public GeoPoint getOrigin() {
		return this.origin; 
	}


	/**
	 * Setter for the origin.
	 * @param origin sets origin in GeoPoint.
	 */
	public void setOrigin( GeoPoint origin ) {
		this.origin = origin;
	}
	
	/**
	 * Setter for color.
	 * @param color Sets color in GeoPoint.
	 */
	public void setColor( Color color ) {
		this.color = color;
	}
	
	
	/**
	 * Getter for the color
	 * @return returns color of GeoPoint.
	 */
	public Color getColor() {
		return this.color;
	}
	
	private String getColorStr(Color color) {
		StringBuilder colorStr = new StringBuilder();
		colorStr = colorStr.append(Integer.toHexString(color.hashCode()));
		colorStr = colorStr.replace(0, 2, "#");
		return colorStr.toString();
	}
	
	/**
	 * Returns the origin of GeoPoint as an integer.
	 * @return Returns x and y ordered pair as integers.
	 */
	public Point getIntOrigin() {
		return this.origin.getIntPoint();
	}

	public String toString() {
		StringBuilder strB = new StringBuilder();
		strB = strB.append("origin=").append(origin)
				.append(",color=").append(getColorStr(color))
				.append(",edgeWidth=").append(edgeWidth)
				.append(",edgeColor=").append(getColorStr(edgeColor));
		return strB.toString();
	}

}