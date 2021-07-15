package Pruebas5;
import java.awt.*;
import java.awt.event.*;

public class DoubleBufferImageDemo extends Frame {
	private static final long serialVersionUID = -7953068362832759593L;
	int gap = 3;
	int mx, my;
	boolean flicker = true;
	Image buffer = null;
	int w = 400, h = 400;
	
	public DoubleBufferImageDemo() {
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				mx = e.getX();
				my = e.getY();
				flicker = false;
				repaint();
			}
			public void mouseMoved(MouseEvent e) {
				mx = e.getX();
				my = e.getY();
				flicker = true;
				repaint();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void paint(Graphics g) {
		Graphics screengc = null;
		
		if(!flicker) {
			screengc = g;
			g = buffer.getGraphics();
		}
		
		g.setColor(Color.blue);
		g.fillRect(0, 0, w, h);
		g.setColor(Color.red);
		
		for(int i = 0; i < w; i += gap) {
			g.drawLine(i, 0, w-i, h);
		}
		for(int i = 0; i < h; i += gap) {
			g.drawLine(0, i, w, h-i);
		}
		
		g.setColor(Color.black);
		g.drawString("Press mouse button to double buffer", 10, h/2);
		
		g.setColor(Color.yellow);
		g.fillOval(mx - gap, my - gap, gap*2+1, gap*2+1);
		
		if(!flicker) {
			screengc.drawImage(buffer, 0, 0, null);
		}
	}
	
	public static void main(String[] args) {
		DoubleBufferImageDemo appwin = new DoubleBufferImageDemo();
		
		appwin.setSize(new Dimension(400, 400));
		appwin.setTitle("Double Buffer.jpg");
		appwin.setVisible(true);
	}
}
