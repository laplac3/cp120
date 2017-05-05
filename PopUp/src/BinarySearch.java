import java.lang.reflect.Array;
import java.util.Arrays;


public class BinarySearch {


	public static void main(String[] args) {
		String[] registered = { "Larry", "Jeen","Laplace"};
		String[] signedIn =  {};
		report( registered, signedIn );

	}
	
	private static void report(String[] registered, String[] signedIn ) {
		
		Arrays.sort( signedIn );
		for (String name : registered ) {
			String msg = name + ": ";
			int pos = Arrays.binarySearch( signedIn , name );
			System.out.println( pos);
			if ( pos < 0 ) 
				msg = msg + "not ";
			msg = msg + "prestent";
			System.out.println(msg);
		}
	}

}
