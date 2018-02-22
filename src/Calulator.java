import java.awt.Color;
import javax.swing.JFrame;


public class Calulator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main (String[]args) {
		calculatorDesign frame = new calculatorDesign();
		// create the frame and set the frame properties		
		 frame.setTitle("Calculator");
		 frame.setSize(380, 270);
		 frame.setLocationRelativeTo(null);// Center the frame
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 frame.setBackground(Color.DARK_GRAY);
		
	}
	
	 
	
	 



}