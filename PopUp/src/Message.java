import javax.swing.JOptionPane;


public class Message {

	public static void main(String[] args) {
	/*	String[] msg = new String[3];
		msg[0] = "Hello World";
		msg[1] = "Something";
		msg[2] = "another message";
		
		
		JOptionPane.showMessageDialog(null,msg[0]);
		
		JOptionPane.showInputDialog(null,msg[1]);
		
		JOptionPane.showMessageDialog(null,msg[2],"header", JOptionPane.WARNING_MESSAGE);
	
		
		String mess = "Click";
		int result = JOptionPane.showConfirmDialog(null, mess);
		if (result == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null,"Are you sure?","header", JOptionPane.WARNING_MESSAGE);
		else
			System.out.println("to bad");
		*/
		
		String prompt ="Enter your name";
		String result = null;
		String name = JOptionPane.showInputDialog(null, prompt);
		if (name == null )
			result = "Operation Cancled";
		else if (name.isEmpty())
			result = "Try again";
		else
			result = "You name is " + name;
		JOptionPane.showMessageDialog(null , result );
		
	}
}

