/*package cp120.assignments.assignment004;

import javax.swing.JOptionPane;

public class Utils2 {


	public static void main(String[] args) throws OpCanceledException {
		int numMin = 9;
		int numMax = 100;
		//askInt(numMin, numMax);
		System.out.print(BigInt.factorial(askInt(numMin, numMax)));
		
	}
	
	public static int askInt(int min, int max) throws OpCanceledException{
		
		StringBuilder msg = new StringBuilder();
		msg = msg.append("Enter an interger between ").append(Integer.toString(min)).append(" and ").append(Integer.toString(max));

		String strNum = JOptionPane.showInputDialog(null, msg);
		
		StringBuilder invalid = new StringBuilder();
		invalid = invalid.append("\"").append(strNum).append("\"").append(" is not valid");

		if ( strNum == null )
			throw new OpCanceledException();
		else {
			for ( int i=0; i< strNum.length(); i++ ) {
				if ( Character.isLetter( strNum.charAt(i)) ) {
					JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
					strNum = JOptionPane.showInputDialog(null, msg);
				}
			}
		}
			
		
		int intNum = Integer.parseInt(strNum);
		if ( intNum <= min ) {
			JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
			askInt(min,max);
		} else if ( intNum >= max ) {
			JOptionPane.showMessageDialog(null, invalid ,"message",JOptionPane.WARNING_MESSAGE);
			askInt(min,max);
		} else
			return intNum;//System.out.println(intNum + 1);
		return intNum;
	}
	
}*/