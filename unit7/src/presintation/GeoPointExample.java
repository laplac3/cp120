package presintation;

public class GeoPointExample {
	
	private double xco;
	private double yco;
	
	public GeoPointExample(double xco, double yco) {
		this.xco =xco;
		this.yco = yco;
	}
	
	public GeoPointExample() { //default 
		this.xco =0;
		this.yco =0;
	}
	
	public String toString() {
		return "(" + xco +","+ yco + ")";
	}
	
}
