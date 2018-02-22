import java.awt.Color;
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


public class calculatorDesign extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	JTextArea display =  new JTextArea(4,6);	
	// TODO Auto-generated constructor stub
		public calculatorDesign() { 
			//CalculatorDisplay CalculatorDisplay = new CalculatorDisplay (name,display);
			 JPanel calculatorPanel = new JPanel ();
			 JPanel numberPanel = new JPanel();
			 numberPanel.setLayout(new GridLayout(5, 6));
			 JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, display,numberPanel);
			 calculatorPanel.add(splitPane);
			 this.add(calculatorPanel);
			 // creating buttons for the calculator GUI
			 JButton Pi = new JButton("\u03C0");
			 JButton factorial = new JButton("!");
			 JButton openBracket = new JButton("(");
			 JButton closeBracket = new JButton(")");
			 JButton percentage = new JButton("%");
			 JButton clearDisplay = new JButton("CE");
			 JButton sine = new JButton("sin");
			 JButton e = new JButton("e");
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
			 JButton zero = new JButton("" + 0);
			 JButton point = new JButton(".");
			 JButton equalTo = new JButton("=");
			 JButton addition = new JButton("+");
			 
			 Color color = new Color(240, 245, 245);
			 Color col = new  Color (0, 128, 128);
			 num1.setBackground(color);
			 num2.setBackground(color);
			 num3.setBackground(color);
			 num4.setBackground(color);
			 num5.setBackground(color);
			 num6.setBackground(color);
			 num7.setBackground(color);
			 num8.setBackground(color);
			 num9.setBackground(color);
			 point.setBackground(color);
			 zero.setBackground(color);
			 equalTo.setBackground(col);
			 
			// Add buttons to the number panel
			 numberPanel.add(Pi);
			 numberPanel.add(factorial);
			 numberPanel.add(openBracket); 
			 numberPanel.add(closeBracket);
			 numberPanel.add(percentage); 
			 numberPanel.add(clearDisplay); 
			 numberPanel.add(sine); 
			 numberPanel.add(e); 
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
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);				
					}});
			 factorial.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						/*String displayText = ((JButton)evt.getSource()).getText();						
						display.setText(display.getText()+displayText);
						String val = display.getText();
						System.out.printe(String.valueOf(displayText));
						String[] num =displayText.split("[^a-zA-Z_0-9]");
						int[] numval = new int[1];
						numval[1]= (int) Double.parseDouble(num[1]);
						int N = numval[0];						
						long valuOffactorial = 1;
					for (int i = 1; i <= N; i++) {
				    	   valuOffactorial = valuOffactorial * i;  
				    }
				       display.setText(val+valuOffactorial);   
				            */
					}});
			 
			
				
				
			 openBracket.addActionListener(this);
			 closeBracket.addActionListener(this);
			 percentage.addActionListener(this);
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
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);
						System.out.println(String.valueOf(displayText));
						
					}});
			 e.addActionListener(this);
			 num7.addActionListener(this);
			 num8.addActionListener(this);
			 num9.addActionListener(this);
			 division.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);
						//enables the point button
						point.setEnabled(true);
					}});
			 cosine.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);						
					}});
			 log.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);						
					}});
			 num4.addActionListener(this);
			 num5.addActionListener(this);
			 num6.addActionListener(this);
			 multiplication.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);
						//enables the point button
						point.setEnabled(true);
					}});
			 tan.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);						
					}});
			 squareRoot.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);						
					}});
			 num1.addActionListener(this);
			 num2.addActionListener(this);
			 num3.addActionListener(this);
			 subtraction.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);
						//enables the point button
						point.setEnabled(true);
					}});
			 exponential.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						String displayText = ((JButton)evt.getSource()).getText() + "()";						
						display.setText(display.getText()+displayText);						
					}});
			 XraisedtoPower.addActionListener(this);						
			 zero.addActionListener(this);
			 point.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the buttons
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);
						//enables the point button
						point.setEnabled(false);
					}});
			 equalTo.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent evt) {
						// TODO Auto-generated method stub
						// Get the value of the display
						String val = (display.getText());
						// replace the value with their respective java operators/class  
						String replacedDisplay =val.replace("sin","Math.sin").				
						       replace("cos", "Math.cos").
						       replace("tan", "Math.tan").
						       replace("\u221A","Math.sqrt").
						       replace("X\u2078", "^").
						       replace("EXP","Math.exp").
						       replace("log", "Math.log").
						       replace("e", "Math.exp(1.0)").
						       replace("\u03C0", "Math.PI").
						       replace("%","/100");
						System.out.println(replacedDisplay);
						//enables the point button
						point.setEnabled(true);
						display.setText("");
						
						
						ScriptEngineManager mathEquations = new ScriptEngineManager();
			   	        ScriptEngine engine = mathEquations.getEngineByName("JavaScript");
			   	        
			   	     try {							
							 double value = (double) engine.eval(replacedDisplay);
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
						String displayText = ((JButton)evt.getSource()).getText();
						display.setText(display.getText()+displayText);
						point.setEnabled(true);
					}});
		}
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		 String val = ((JButton)event.getSource()).getText();
		 display.setText(display.getText()+val);		 
	}
		
}


