package Presintation;

import java.io.FileNotFoundException;
import java.io.IOException;

public class fileNotFound {

	public static void main(String[] args) {
		excute();

	}
/*	
	public static void excute() {
		
		try {
			openFile( "Test.tmp" );
		} catch (FileNotFoundException exc ) {
			exc.printStackTrace();
			System.exit( 1 );
		}
	}
	
	private static void openFile( String name ) throws FileNotFoundException {
		throw new FileNotFoundException( name + " not found" );
	}

	public void methodA() throws Exception {
		methodB();
	}
	
	public void methodB() throws Exception {
		methodC();
	}
	
	public void methodC() throws Exception {
		throw new Exception();
	}
*/	
	

	private static void excute() {
		try {
			
			openFile( "Test.tmp" );

		} catch ( IOException /*| ClassNotFoundException */| IllegalArgumentException exc ) {
			exc.printStackTrace();
			System.exit(1);
		}
	}
	private static void openFile( String name ) throws FileNotFoundException {
		throw new FileNotFoundException( name + " not found" );
	}

	
}
