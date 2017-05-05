package cp120.assignments.geo_shape;

import java.awt.Point;

public class GeoPoint {
	
	private float xco;
	private float yco;
	
	public float getXco() {
		return xco;
	}
	public void setXco(float xco) {
		this.xco = xco;
	}
	public float getYco() {
		return yco;
	}
	public void setYco(float yco) {
		this.yco = yco;
	}
	
	public Point getIntPoint() {
		int xco = Math.round(getXco());
		int yco = Math.round(getYco());
		Point pair = new Point(xco,yco);
		return pair;
	}
	
	public float distance(GeoPoint other) {
		float xdis = other.xco-this.xco;
		float xSquare = xdis*xdis;
		float ydis = other.yco-this.xco;
		float ySquare = ydis*ydis;
		float disSquare = ySquare + xSquare;
		float dis = (float) Math.sqrt(disSquare);
		return dis;
	}
	
	public String toString() {
		StringBuilder xY = new StringBuilder();
		xY = xY.append("(").append(xco).append(",").append(yco).append(")");
		return xY.toString();
	}
}
