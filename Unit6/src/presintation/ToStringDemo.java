package presintation;

public class ToStringDemo {

	private int iField = 42;
	private double dField =3.14;
	
	public static void main(String[] args) {
	
		ToStringDemo demo = new ToStringDemo();
		System.out.println(demo);

	}
	
	public String toString() {
		
		StringBuilder bldr = new StringBuilder();
		bldr.append("iField= ").append(iField).append(",");
		bldr.append("dField= ").append(dField).append(",");
		return bldr.toString();
	}

}
