package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

	
	boolean isOperatorClicked=false;
	
	String newValue;
	String oldValue;
	float newValueF;
	float oldValueF;
	int operator=0;
	
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divButton;
	JButton mulButton;
	JButton minusButton;
	JButton plusButton;
	JButton clearButton;
	
	public Calculator() {
		
		jf=new JFrame("CALCULATOR");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setLocation(300, 150);
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 20, 540, 90);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.DARK_GRAY);
		displayLabel.setFont(new Font("Arial", Font.BOLD, 60));
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(oneButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(equalButton);
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(divButton);
		
		mulButton=new JButton("x");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.BOLD, 40));
		jf.add(clearButton);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
				
	 }
	 
	 public static void main(String[] args) {
	  Calculator c=new Calculator();
	  
		
	}


	 
	@Override
	public void actionPerformed(ActionEvent e) {
		
if(e.getSource()==sevenButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"7");
			}
			
		}else if(e.getSource()==eightButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==nineButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"9");
			}	
			
		}else if(e.getSource()==fourButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;	
			}else {		
			displayLabel.setText(displayLabel.getText()+"4");
			}
			
		}else if(e.getSource()==fiveButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;	
			}else {		
			displayLabel.setText(displayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==sixButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;	
			}else {		
			displayLabel.setText(displayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==oneButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"1");
			}
			
		}else if(e.getSource()==twoButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;	
			}else {	
			displayLabel.setText(displayLabel.getText()+"2");
			}
			
		}else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"3");	
			}
			
		}else if(e.getSource()==dotButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+".");
			}
			
		}else if(e.getSource()==zeroButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;	
			}else {
			displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()==equalButton) {
			
			isOperatorClicked=true;	
			oldValueF=Float.parseFloat(displayLabel.getText());
			
			switch(operator){
			case 1:	
			oldValueF=oldValueF/newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 2:	
			oldValueF=oldValueF*newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 3:	
			oldValueF=oldValueF-newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 4:	
			oldValueF=oldValueF+newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			}
			
		operator=0;
			
			//displayLabel.setText(displayLabel.getText()+"=");
		}else if(e.getSource()==divButton) {
			
			isOperatorClicked=true;	
			oldValueF=Float.parseFloat(displayLabel.getText());
			
			switch(operator){
			case 1:	
			oldValueF=oldValueF/newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 2:	
			oldValueF=oldValueF*newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 3:	
			oldValueF=oldValueF-newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 4:	
			oldValueF=oldValueF+newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			}
			
			newValueF=Float.parseFloat(displayLabel.getText());
			operator=1;
			displayLabel.setText("/");
			
		}else if(e.getSource()==mulButton) {
			
			isOperatorClicked=true;	
			oldValueF=Float.parseFloat(displayLabel.getText());
			
			switch(operator){
			case 1:	
			oldValueF=oldValueF/newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 2:	
			oldValueF=oldValueF*newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 3:	
			oldValueF=oldValueF-newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 4:	
			oldValueF=oldValueF+newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			}
			
			newValueF=Float.parseFloat(displayLabel.getText());
			operator=2;			
			displayLabel.setText("x");
			
		}else if(e.getSource()==minusButton) {
			
			isOperatorClicked=true;	
			oldValueF=Float.parseFloat(displayLabel.getText());
			
			switch(operator){
			case 1:	
			oldValueF=oldValueF/newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 2:	
			oldValueF=oldValueF*newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 3:	
			oldValueF=oldValueF-newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 4:	
			oldValueF=oldValueF+newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			}
			
			newValueF=Float.parseFloat(displayLabel.getText());
			operator=3;
			displayLabel.setText("-");
			
		}else if(e.getSource()==plusButton){
			
			
			isOperatorClicked=true;	
			oldValueF=Float.parseFloat(displayLabel.getText());
			
			switch(operator){
			case 1:	
			oldValueF=oldValueF/newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 2:	
			oldValueF=oldValueF*newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 3:	
			oldValueF=oldValueF-newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			case 4:	
			oldValueF=oldValueF+newValueF;
			displayLabel.setText(oldValueF+"");
			break;
			}
			
			newValueF=Float.parseFloat(displayLabel.getText());
			operator=4;
			displayLabel.setText("+");
			
		}else if(e.getSource()==clearButton) {
			displayLabel.setText(""); 
		}
		


	 


		
		
	}

}

