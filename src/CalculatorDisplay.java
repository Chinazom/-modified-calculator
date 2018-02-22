import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorDisplay extends JButton implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String display;

	public CalculatorDisplay (String name, String display) {		
		super(name);
		addActionListener(this);		
		this.display = display;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		// TODO Auto-generated method stub
		// gets the from the buttons a 
		this.getText();
		System.out.println (this);
		
	}

}
