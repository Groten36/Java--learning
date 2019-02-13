import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ObrazPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private BufferedImage diskImage;
	private BufferedImage netImage;
	
	public ObrazPanel() {
		super();
		
		try {
			File file =new File("pobrany plik2.jpg");
			diskImage=ImageIO.read(file);
			
			URL imageURL=new URL("https://i1.wp.com/grimuar.pl/sites/default/files/portrait_eder_lg.png?w=1500&quality=100&strip=all");
			netImage=ImageIO.read(imageURL);
		}catch(IOException e) {
			JOptionPane.showMessageDialog(this,"Blad odczyru obrazka");
		}
		int width=diskImage.getWidth()+netImage.getWidth();
		int height=netImage.getHeight();
		Dimension dimension=new Dimension(width,height);
		setPreferredSize(dimension);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(diskImage,0,0,this);
		g.drawImage(netImage,diskImage.getWidth(),0,this);
	}

}
