
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MouseTestPanel extends JPanel implements MouseListener, MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;

	private int x, y;
	
	Point move;
	

	ArrayList<Point> points = new ArrayList<Point>();

	public MouseTestPanel() {
		addMouseListener(this);
		addMouseMotionListener(this);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		Point remove=null;
		int xp, yp;
		if(e.getButton()==MouseEvent.BUTTON1) {
		points.add(new Point(x, y));
		repaint();}
		if(e.getButton()==MouseEvent.BUTTON3) {
			
			for(Point p:points) {
				 xp=(int) p.getX();
				 yp=(int) p.getY();
				if(x>=xp&&x<=xp+10&&y>=yp&&y<=yp+10)
					remove=p;
					//points.remove(remove);
					//repaint();}}
			}
			//repaint();
			points.remove(remove);
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		move=null;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, WIDTH, HEIGHT);
		g2d.setColor(Color.BLACK);
		drawRectangles(g2d);
	}

	private void drawRectangles(Graphics2D g2d) {
		int x, y;
		for(Point p: points) {
			x = (int)p.getX();
			y = (int)p.getY();
			g2d.fillRect(x, y, 10, 10);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(move!=null) {
		move.x=e.getX();
		move.y=e.getY();
		repaint();}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
