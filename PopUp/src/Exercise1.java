import javax.swing.JOptionPane;


public class Exercise1 {

	public static void main(String[] args) {
		String prompt[] = new String[2];
		prompt[0] = "Enter something";
		prompt[1] = "Enter something else";
		
		String str1 = JOptionPane.showInputDialog(null, prompt[0]);
		String str2 = JOptionPane.showInputDialog(null, prompt[1]);
		
		if (str1.equals(str2) && !str1.isEmpty())
			JOptionPane.showMessageDialog(null,"You entered the same thing twice" );
		if ( str1==null || str2 == null )
			JOptionPane.showMessageDialog(null,"Shuting down" );
		else if (str1.isEmpty() || str2.isEmpty()) {
			JOptionPane.showMessageDialog(null,"Try again" );
			str1 = JOptionPane.showInputDialog(null, prompt[0]);
			str2 = JOptionPane.showInputDialog(null, prompt[1]);
		}
		else 
			JOptionPane.showMessageDialog(null,"You entered differant stuff" );

	}

}
