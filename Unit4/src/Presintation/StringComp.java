package Presintation;

public class StringComp {

	public static void main(String[] args) {
		
		String[][] words = {{"Zebra", "Aardvark"},{"Zulu", "anteater"},{"market", "Market"},{"200", "30"},{"100", "-100"}};
		compString( words );
		
	}
	
	private static void compString(String[][] words) {
		
		for ( String[] x  : words ) {
			if ( x[0].compareTo(x[1]) > 0)
				System.out.println( x[0] + " is greater the " + x[1]);
			else if (x[0].compareTo(x[1]) < 0 )
				System.out.println( x[1] + " is greater than " + x[0]);
			else 
				System.out.println( x[1] + " is equal to " + x[0]);
		}
		
	}
// a string that begins with '-' is less then a string that comes with a '1'

	

}
