import javax.swing.JFrame;

public class Frame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ObrazPanel panel=new ObrazPanel();
	
	public Frame() {
	super("Obraz");
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setContentPane(panel);
	pack();
	setVisible(true);
	}
}
