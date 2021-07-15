package Pruebas4;
import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = -1100451229214908047L;
	String msg = "";
	int mouseX = 0, mouseY = 0;
	
	public MouseEventsDemo( ) {
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new MouseEvents_WindowListener_MyWindowAdapter());
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*" + " mouse at " + mouseX + ", " + mouseY;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		msg = "Moving mouse at " + e.getX() + ", " + e.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		msg = msg + " -- click received";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Button down";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Button released";
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse entered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 100;
		mouseY = 100;
		msg = "Mouse exited";
		repaint();
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
	
	public static void main(String[] args) {
		MouseEventsDemo appwin = new MouseEventsDemo();
		
		appwin.setSize(new Dimension(300, 300));
		appwin.setTitle("MouseEventsDemo");
		appwin.setVisible(true);
	}
}