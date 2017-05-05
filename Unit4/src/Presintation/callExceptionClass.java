package Presintation;

import javax.swing.*;
public class callExceptionClass {

	public static void main(String[] args) throws OpCancledException {
		getInput();

	}
	
	private static String getInput() throws OpCancledException {
		String msg = "Enter date";
		String date = JOptionPane.showInputDialog( null, msg );
		if ( date == null )
			throw new OpCancledException();
		
		return date;
	}

}
