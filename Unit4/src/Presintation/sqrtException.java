
package Presintation;

public class sqrtException {

	public static void main(String[] args) {
		
		System.out.println(sqrt(-1));

	}
	
	public static double sqrt( double num ) {
		if (num < 0 ) 
			throw new IllegalArgumentException();
		else 
			return Math.sqrt(num);
	}

}
