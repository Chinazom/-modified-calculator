import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class calculatorDesign extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// TODO Auto-generated constructor stub
		public calculatorDesign() { 
			//CalculatorDisplay CalculatorDisplay = new CalculatorDisplay (name,display);
			 JPanel calculatorPanel = new JPanel ();	
			 JTextArea display =  new JTextArea(4,6);
			 JPanel numberPanel = new JPanel();
			 numberPanel.setLayout(new GridLayout(5, 6));
			 JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, display,numberPanel);
			 calculatorPanel.add(splitPane);
			 this.add(calculatorPanel);
			 // creating buttons for the calculator GUI
			 JButton Pi = new JButton("\u03C0");
			 JButton factorial = new JButton("X!");
			 JButton openBracket = new JButton("(");
			 JButton closeBracket = new JButton(")");
			 JButton percentage = new JButton("%");
			 JButton clearDisplay = new JButton("CE");
			 JButton sine = new JButton("sin");
			 JButton ln = new JButton("ln");
			 JButton num7 = new JButton("7");
			 JButton num8 = new JButton("8");
			 JButton num9 = new JButton("9");
			 JButton division = new JButton("/");	 
			 JButton cosine = new JButton("cos");
			 JButton log = new JButton("log");
			 JButton num4 = new JButton("4");
			 JButton num5 = new JButton("5");
			 JButton num6 = new JButton("6");
			 JButton multiplication = new JButton("*");
			 JButton tan = new JButton("tan");
			 JButton squareRoot = new JButton("\u221A");
			 JButton num1 = new JButton("1");
			 JButton num2 = new JButton("2");
			 JButton num3 = new JButton("3");
			 JButton subtraction = new JButton("-");
			 JButton exponential = new JButton("EXP");
			 JButton XraisedtoPower = new JButton("X\u2072");
			 JButton zero = new JButton("0");
			 JButton point = new JButton(".");
			 JButton equalTo = new JButton("=");
			 JButton addition = new JButton("+");
			 
			// Add buttons to the number panel
			 numberPanel.add(Pi);
			 numberPanel.add(factorial);
			 numberPanel.add(openBracket); 
			 numberPanel.add(closeBracket);
			 numberPanel.add(percentage); 
			 numberPanel.add(clearDisplay); 
			 numberPanel.add(sine); 
			 numberPanel.add(ln); 
			 numberPanel.add(num7); 
			 numberPanel.add(num8); 
			 numberPanel.add(num9); 
			 numberPanel.add(division); 
			 numberPanel.add(cosine);
			 numberPanel.add(log); 
			 numberPanel.add(num4); 
			 numberPanel.add(num5);
			 numberPanel.add(num6);
			 numberPanel.add(multiplication); 
			 numberPanel.add(tan); 
			 numberPanel.add(squareRoot); 
			 numberPanel.add(num1); 
			 numberPanel.add(num2); 
			 numberPanel.add(num3); 
			 numberPanel.add(subtraction); 
			 numberPanel.add(exponential); 
			 numberPanel.add(XraisedtoPower); 
			 numberPanel.add(zero); 
			 numberPanel.add(point); 
			 numberPanel.add(equalTo); 
			 numberPanel.add(addition); 
		
// add action listeners to the buttons
			 Pi.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent evt) {
					// TODO Auto-generated method stub
					// Get the value of the buttons
					String val = ((JButton)evt.getSource()).getText();					
				}});
			 factorial.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 openBracket.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();						
					}});
			 closeBracket.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 percentage.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 clearDisplay.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						//clear the display
						display.setText("");
						point.setEnabled(true);
					}});
			 sine.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 ln.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num7.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num8.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num9.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 division.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						//enables the point button
						String val = ((JButton)evt.getSource()).getText();
						point.setEnabled(true);
					}});
			 cosine.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 log.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num4.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num5.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num6.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 multiplication.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();
						//enables the point button
						point.setEnabled(true);
					}});
			 tan.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 squareRoot.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num2.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 num3.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 subtraction.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();
						//enables the point button
						point.setEnabled(true);
					}});
			 exponential.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 XraisedtoPower.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 zero.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
			 point.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();
						point.setEnabled(false);
					}});
			 equalTo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the display
						String val = (display.getText());
						//enables the point button
						point.setEnabled(true);
						display.setText("");
						
						ScriptEngineManager mathEquations = new ScriptEngineManager();
			   	        ScriptEngine engine = mathEquations.getEngineByName("JavaScript");
			   	        //String exp = val;
			   	     try {							
							 double value = (double) (engine.eval(val));
							 System.out.println(value);
							 String finalResult = String.valueOf(value);
							 display.setText(finalResult);
							 
						} catch (ScriptException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();
						}
					}});
			 addition.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String val = ((JButton)evt.getSource()).getText();		            				
					}});
	 
	 
	 
	 
	
	
		}
		
}


