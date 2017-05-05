package cp120.assignments.geo_shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CompairOutPut {
	
	public static void main(String[] args) throws FileNotFoundException {
	

		Scanner his = new Scanner(new File("/home/neil/workspace/unit7/sample_output.txt"));

		Scanner mine = new Scanner(new File("/home/neil/workspace/unit7/MyOutPut.txt"));

		
		
	
		StringBuilder mineB = new StringBuilder();
		StringBuilder hisB = new StringBuilder();
		
		while(mine.hasNext() ) {
			mineB.append(mine.next());
			hisB.append(his.next());
		}
		
		System.out.println(mineB.toString().compareTo(hisB.toString()));

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
}
