import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JButton button1 =new JButton("Pierwszy");
	JButton button2 =new JButton("Drugi");
	JButton button3 =new JButton("Trzeci");
	
	Color[] color= {Color.GREEN,Color.BLUE,Color.RED};
	boolean push=false;
	
	public Panel() {
		super();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source=e.getSource();
		
		if(source==button1) {
			//Color[] color= {Color.GREEN,Color.BLUE,Color.RED};
			int index=new Random().nextInt(color.length);
			setBackground(color[index]);
		}
		
		if(source==button2) {
			setBackground(Color.YELLOW);
		}
		
		if(source==button3) {
			if(push) {
			button3.setText("Wcisniety");}
			else
				button3.setText("Trzeci");
			push=!push;
		}
		
	}
	
	

}
