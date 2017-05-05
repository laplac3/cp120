package cp120.assignments.assignment004;

import javax.swing.JOptionPane;

import Presintation.OpCancledException;

import java.lang.NumberFormatException;

public class Utils {


	public static void main(String[] args) throws OpCancledException {
	
	 //Test	
		int numMin = 9;
		int numMax = 100;
	askInt(numMin, numMax);
		boolean working = true;
		while ( working ) { 
			try {
				int ans = askInt(numMin, numMax);
				System.out.println(ans);
				if (ans >= 9 && ans <=100 )
					working = false;
			}  catch (	OpCancledException exc ){
				working = false;
			}
			
		}
	
	}	
		
	
	
	public static int askInt(int min, int max) throws OpCancledException{
		
		while(true) {
			
			int result = 0;
			
			StringBuilder msg = new StringBuilder();
			msg = msg.append("Enter an interger between ").append(Integer.toString(min)).append(" and ").append(Integer.toString(max));

			String strNum = JOptionPane.showInputDialog(null, msg);
			
			StringBuilder invalid = new StringBuilder();
			invalid = invalid.append("\"").append(strNum).append("\"").append(" is not valid");
			
			
			if (strNum == null )
				throw new OpCancledException();
			
				try {
					int intNum = Integer.parseInt(strNum);
					if ( intNum < min ) 
						JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
					
					else if ( intNum > max )
						JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
						
					else
						result = intNum;
					
				} catch ( NumberFormatException n) {
					JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
				}
			return result;

		}
	}
}