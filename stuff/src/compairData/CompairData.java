package compairData;

import java.util.*;
import java.io.*;


public class CompairData {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner dataA = new Scanner(new File("MyData"));
		Scanner dataB = new Scanner(new File("sample_output.txt"));
		
		String strA = dataA.nextLine();
		String strB = dataB.nextLine();
		int line =1;
		
		while (dataA.hasNextLine() ){
				
			if ( strA.compareTo(strB)==0 ) {
				System.out.println("Line " + line + ": Pass");
				line++;
			} else {
				System.out.println("Line " + line + ": Fail");
				line++;
				System.out.println(strA);
				System.out.println(strB);
			}
			strA = dataA.nextLine();
			strB = dataB.nextLine();
		}
	}


}

